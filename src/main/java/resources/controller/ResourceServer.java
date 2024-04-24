package resources.controller;

import resources.TestResource;

/**
 * Created by Андрей on 06.03.2018.
 */
public class ResourceServer implements ResourceServerMBean {

    private TestResource testResource;

    public ResourceServer(){
        this.testResource = new TestResource();
    }

    public void changeTestResource(TestResource testResource){
        this.testResource = testResource;
    }

    @Override
    public int getAge() {

       return testResource.getAge();
    }

    @Override
    public String getName() {
        return testResource.getName();
    }
}
