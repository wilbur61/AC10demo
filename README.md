# In Controller
 @PutMapping("/tutorials/{id}")
   public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
       Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(id);
       System.out.println("IN PutMapping(/tutorials/{id}");
       if (tutorialData.isPresent()) {
           tutorialServices.updateTutorial(id,tutorial);
#           // Eliminating duplicate code below
           //Tutorial _tutorial = tutorialData.get();
           //_tutorial.setTitle(tutorial.getTitle());
           //_tutorial.setDescription(tutorial.getDescription());
           //_tutorial.setPublished(tutorial.isPublished());
          // tutorialServices.addTutorial(_tutorial);
       }
   }
