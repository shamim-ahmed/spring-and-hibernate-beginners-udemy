package edu.buet.cse.section9.project5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyCustomBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

  private BeanFactory beanFactory;
  List<Object> prototypeBeanList = new ArrayList<>();

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory = beanFactory;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) {
    if (beanFactory.isPrototype(beanName)) {
      prototypeBeanList.add(bean);
    }
    
    return bean;
  }

  @Override
  public void destroy() throws Exception {
    synchronized (prototypeBeanList) {
      for (Object bean : prototypeBeanList) {
        if (bean instanceof DisposableBean) {
          DisposableBean disposableBean = (DisposableBean) bean;

          try {
            disposableBean.destroy();
          } catch (Exception ex) {
            System.out.println(ex);
          }
        }
      }
    }
  }
}
