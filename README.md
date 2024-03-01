# In Controller
 @PutMapping("/tutorials/{id}")    <br?
   public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) { <br>
       Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(id);  <br>
       System.out.println("IN PutMapping(/tutorials/{id}");   <br>
       if (tutorialData.isPresent()) { <br>
           tutorialServices.updateTutorial(id,tutorial);
#           // Eliminating duplicate code below
           //Tutorial _tutorial = tutorialData.get();
           //_tutorial.setTitle(tutorial.getTitle());
           //_tutorial.setDescription(tutorial.getDescription());
           //_tutorial.setPublished(tutorial.isPublished());
          // tutorialServices.addTutorial(_tutorial);
       }
   }
