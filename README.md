# bongard-solver
Attempting to automate the solving of Bongard Problems (BPs).

### Acknowledgements
Bongard M.M.- "Pattern Recognition" 1967

Thanks to Foundalis, my initial dataset is pulled form their representations of the original problems presented by Bongard 

### Dataset
The index of BP images that serve as input to the solver reside in ./resources/images

The related dictionary of solutions is in .csv format in ./resources/data

## Problem:
* Given n images, produce a description of difference between the left and right sides of a BP


#### Sub-problems:
* Generalize a set of features from available solutions for original problem-set (may be impossible - work backwards instead, limits, rules)

* Prove generalization holds for community-generated BP's

* Extract a large enough set of #salient_features to encompass solution #feature
*** Shortcut: ChatGPT image recognition with a tuned prompt
**Craft prompt for chatGPT to recognize salient features
*** Test prompt for 100% accuracy on original problem set with no prior knowledge
*** Test prompt for 99% accuracy on community-generated problems
* Prove that #feature is shared among 6 left images
* Prove that #feature is not shared in any of 6 right images


