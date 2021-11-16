# DPP
**DPP** (or DesignPatternsPoker) is a school project, the goal of this assgiment was to create a "Poker" game using appropriate design patterns.

## Diagrams:

### Business concept:
![Business Concept](https://github.com/SpaceGauchoDev/DPP/blob/main/docs/BusinessConcept.png "Business Concept")

### UML:
![Business Concept](https://github.com/SpaceGauchoDev/DPP/blob/main/docs/UML.png "UML")

### Game state machine:
![Business Concept](https://github.com/SpaceGauchoDev/DPP/blob/main/docs/StateMachine_Game.png "Game state machine")

### Round state machine:
![Business Concept](https://github.com/SpaceGauchoDev/DPP/blob/main/docs/StateMachine_Round.png "Round state machine")

## Adding new patterns:
1. Create a class for your the pattern e.g. ´NewPattern´ this class must extend from the class ´Pattern´.
2. Extend the ´PatternEnum´ enum to add ´P_NEW_PATTERN´ in its corresponding rank.
3. The constructor of ´NewPattern´ must call ´setPattern(PatternEnum.P_NEW_PATTERN).
4. Override the ´satisfiesPattern(...´ method in ´NewPattern´. 
5. The ´satisfiesPattern(...´ must call ´setValue( ´ and pass it the NewPattern resolution.
6. If more than one ´NewPattern´ can be formed with a single ´Hand´, create tie breaker logic and call ´setValue(´ with the higest valued NewPattern found.
