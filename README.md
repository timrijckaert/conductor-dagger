# Conductor Dagger
Some helper classes that will allow you to inject your Conductor Controllers with Dagger.  
This is a fork of https://github.com/Bodo1981/conductor-dagger.

I wanted to experimented with it some more.

## Goal
I added a fake dependency on each level of the app.  
Scopes in the app include

> Application -> Activity -> Controller

<img src=".art/dagger_scope.png" width=600></img>

And the related dependencies:  
> ApplicationDep, ActivityDep and ControllerDep

In this sample I want to showcase these possibilities:
* The `Controller` should have access to the `ApplicationDep`, `ActivityDep` and the `ControllerDep`
* The `Activity` should be able to inject the `ApplicationDep` and the `ActivityDep`
* The `Application` should solely be able to inject the `ApplicationDep`
