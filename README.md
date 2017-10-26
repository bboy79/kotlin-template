# kotlin-template
Kotlin project template following an MVVM approach.

The project comes with a basic **Dagger2** and **Architecture Components** implementation.

## External libraries used
* Dagger2;
* RxJava2;
* RxKotlin;
* RxAndroid;
* Retrofit;
* OkHttp;
* Moshi;
* Timberkt.

## The project has the following packages:

1. data: It contains all the data access and manipulation components, which are then aggregated in a single data manager class (a.k.a. repository);
2. di: Components, modules and helper classes/interfaces for dependency injection
3. ui: View classes (fragments) along with their corresponding view models;
4. utils: Utility classes (AppConstants, etc);



**This project was heavily based on [Google's Github browser example](https://github.com/googlesamples/android-architecture-components/tree/master/GithubBrowserSample)**

## License
```
Copyright 2017 Ricardo Costeira

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```