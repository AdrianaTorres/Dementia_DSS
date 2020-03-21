(deftemplate patient

;-----OVERALL-----
(multislot name
(default _))
(slot sex)
(slot age)
(slot familyHistoryOfDisease)
(slot downsSyndrome)
(slot hyperglycemia)
(slot insulinResistance)
(slot hyperlipidemia)
(slot arterialHypertension)
(slot recordHeartCerebroAttacks)
(slot diabetes) 
(slot smoking)
(slot obesity)
(slot highCholesterol)
(slot lossOfCoordination)
(slot arteriosclerosis)
(slot depression)
(slot lowLevelsEducation)
(slot difficultiesWords)
(slot memoryProblems)
(slot organizationProblems)
(slot forgetPersonalInfo)
(slot noStandWalk)
(slot bradykinesiaL)
(slot bradykinesiaM)
(slot bradykinesiaH)
(slot orientationImpL)
(slot orientationImpH)
(slot behaviour)
(slot emotionalInstability)
(slot chemicalsExposure)
(slot drugConsumption)
(slot tremor)
(slot stiffness)
(slot balanceLoss)
(slot straightWalkingProblems)
(slot smellLoss)
(slot incontinence)
(slot sleepingProblems)
(slot facialExpressionLoss)
;------ALZHEIMER SPECIFIC-----
(slot lostPhysicalAbilityA)
(slot stiffnessLAP2)
(slot stiffnessHAP3)
(slot hyperreflexiaA)
;------PARKINSON SPECIFIC-----
(slot lostPhysicalAbilityP)
(slot tremorUnilP)
(slot tremorBilP)
;-----SCORES OVERALL -----
(slot SCsex
(default FALSE))
(slot SCage
(default FALSE))
(slot SCfamilyHistoryOfDisease
(default FALSE))
(slot SCdownsSyndrome
(default FALSE))
(slot SChyperglycemia
(default FALSE))
(slot SCinsulinResistance
(default FALSE))
(slot SChyperlipidemia
(default FALSE))
(slot SCarterialHypertension
(default FALSE))
(slot SCrecordHeartCerebroAttacks
(default FALSE))
(slot SCdiabetes
(default FALSE)) 
(slot SCsmoking
(default FALSE))
(slot SCobesity
(default FALSE))
(slot SChighCholesterol
(default FALSE))
(slot SClossOfCoordination
(default FALSE))
(slot SCarteriosclerosis
(default FALSE))
(slot SCdepression
(default FALSE))
(slot SClowLevelsEducation
(default FALSE))
(slot SCdifficultiesWords
(default FALSE))
(slot SCmemoryProblems
(default FALSE))
(slot SCorganizationProblems
(default FALSE))
(slot SCforgetPersonalInfo
(default FALSE))
(slot SCnoStandWalk
(default FALSE))
(slot SCbradykinesiaL
(default FALSE))
(slot SCbradykinesiaM
(default FALSE))
(slot SCbradykinesiaH
(default FALSE))
(slot SCorientationImpL
(default FALSE))
(slot SCorientationImpH
(default FALSE))
(slot SCbehaviour
(default FALSE))
(slot SCemotionalInstability
(default FALSE))
(slot SCchemicalsExposure
(default FALSE))
(slot SCdrugConsumption
(default FALSE))
(slot SCtremor
(default FALSE))
(slot SCstiffness
(default FALSE))
(slot SCbalanceLoss
(default FALSE))
(slot SCstraightWalkingProblems
(default FALSE))
(slot SCsmellLoss
(default FALSE))
(slot SCincontinence
(default FALSE))
(slot SCsleepingProblems
(default FALSE))
(slot SCfacialExpressionLoss
(default FALSE))
;------SCORES ALZHEIMER-----
(slot SCforgetPersonalInfoAP2and3
(default FALSE))
(slot SClostPhysicalAbilityA
(default FALSE))
(slot SCorientationImpLAP2
(default FALSE))
(slot SCorientationImpHAP3
(default FALSE))
(slot SCbehaviourAP2and3
(default FALSE))
(slot SCemotionalInstabilityAP2and3
(default FALSE))
(slot SCstiffnessLAP2
(default FALSE))
(slot SCstiffnessHAP3
(default FALSE))
(slot SClossOfCoordinationAP3
(default FALSE))
(slot SCincontinenceAP3
(default FALSE))
(slot SCsleepingProblemsAP3
(default FALSE))
(slot SChyperreflexiaA
(default FALSE))
;-----SCORES PARKINSON ------
(slot SCnoStandWalkP
(default FALSE))
(slot SClostPhysicalAbilityP
(default FALSE))
(slot SCbradykinesiaLMP
(default FALSE))
(slot SCbradykinesiaHP
(default FALSE))
(slot SCtremorUnilP
(default FALSE))
(slot SCtremorBilP
(default FALSE))
(slot SCstiffnessP
(default FALSE))
(slot SClossOfCoordinationP
(default FALSE))
(slot SCincontinenceP
(default FALSE))
;-----SCORES VASCULAR DEMENTIA-----
(slot SCmemoryProblemsV
(default FALSE))
(slot SCorganizationProblemsV
(default FALSE))
(slot SCorientationImpLV
(default FALSE))
(slot SCorientationImpHV
(default FALSE))
(slot SCbehaviourV
(default FALSE))
(slot SCemotionalInstabilityV
(default FALSE))
(slot SClossOfCoordinationV
(default FALSE))
(slot SCincontinenceV
(default FALSE))
;------OTHER NEEDED VARIABLES-----
; --Alz---
(slot alzheimer
(default FALSE))
(slot alzheimerP1
(default FALSE))
(slot alzheimerP2
(default FALSE))
(slot alzheimerP3
(default FALSE))
(slot counterAlzheimer
(default 0))
(slot counterAlzPhase
(default 0))
;--- Park ----
(slot parkinson
(default FALSE))
(slot parkinsonP1
(default FALSE))
(slot parkinsonP2
(default FALSE))
(slot parkinsonP3
(default FALSE))
(slot counterParkinson
(default 0))
(slot counterParPhase
(default 0))
;--- Vasc----
(slot vascular
(default FALSE))
(slot vascularP1
(default FALSE))
(slot vascularP2
(default FALSE))
(slot vascularP3
(default FALSE))
(slot counterVascular
(default 0))
(slot counterVasPhase
(default 0))
;--- No demen ----
(slot noDementia
(default FALSE)))

;----------INITIAL FACT -------
(deffacts patient "Initial blank patient"
(patient))



;----SCORE CALCULATION-----

(defrule scoreSex "Score for sex"
?patient <- (patient(sex W) (SCsex FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SCsex TRUE)))

(defrule scoreSex2 "Score for sex"
?patient <- (patient(sex M) (SCsex FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1)) (SCsex TRUE)))


(defrule scoreAge "Score for age (55-80)"
?patient <- (patient(age ?ageValue) (SCage FALSE) (counterParkinson ?counterP))
(test (numberp ?ageValue))
(and (test (> ?ageValue 55)) (test(< ?ageValue 80)))
=>
(modify ?patient (counterParkinson (+ ?counterP 1)) (SCage TRUE)))


(defrule scoreAge2 "Score for age (> 80)"
?patient <- (patient(age ?ageValue) (SCage FALSE) (counterParkinson ?counterP) (counterAlzheimer ?counterA) (counterVascular ?counterV))
(test (numberp ?ageValue))
(test (> ?ageValue 80))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCage TRUE)))


(defrule scoreFamilyHistoryOfDisease "Score for family history of disease"
?patient <- (patient(familyHistoryOfDisease TRUE) (SCfamilyHistoryOfDisease FALSE) (counterAlzheimer ?counterA) (counterParkinson ?counterP))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterParkinson (+ ?counterP 1)) (SCfamilyHistoryOfDisease TRUE)))


(defrule scoreDownsSyndrome "Score for Downs syndrome"
?patient <- (patient(downsSyndrome TRUE) (SCdownsSyndrome FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SCdownsSyndrome TRUE)))

(defrule scoreHyperglycemia "Score for hyperglycemia"
?patient <- (patient(hyperglycemia TRUE) (SChyperglycemia FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SChyperglycemia TRUE)))


(defrule scoreinsulinResistance "Score for insulin resistance"
?patient <- (patient(insulinResistance TRUE) (SCinsulinResistance FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SCinsulinResistance TRUE)))


(defrule scoreHyperlipidemia "Score for hyperlipidemia"
?patient <- (patient(hyperlipidemia TRUE) (SChyperlipidemia FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1))(SChyperlipidemia TRUE)))


(defrule scoreArterialHypertension"Score for arterial hypertension"
?patient <- (patient(arterialHypertension TRUE) (SCarterialHypertension FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1))(SCarterialHypertension TRUE)))


(defrule scoreRecordHeartCerebroAttacks"Score for record in Heart ot Cerebrovascular Attacks"
?patient <- (patient(recordHeartCerebroAttacks TRUE) (SCrecordHeartCerebroAttacks FALSE) (counterVascular ?counterV))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SCrecordHeartCerebroAttacks TRUE)))


(defrule scoreDiabetes "Score for diabetes"
?patient <- (patient(diabetes TRUE) (SCdiabetes FALSE) (counterVascular ?counterV))
=>
(modify ?patient (counterVascular (+ ?counterV 1)) (SCdiabetes TRUE)))


(defrule scoreSmoking "Score for smoking"
?patient <- (patient(smoking TRUE) (SCsmoking FALSE) (counterVascular ?counterV))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SCsmoking TRUE)))


(defrule scoreObesity "Score for obesity"
?patient <- (patient(obesity TRUE) (SCobesity FALSE) (counterVascular ?counterV))
(not(SCobesity TRUE))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SCobesity TRUE)))


(defrule scoreHighCholesterol "Score for high cholesterol"
?patient <- (patient(highCholesterol TRUE) (SChighCholesterol FALSE) (counterVascular ?counterV))
(not(SChighCholesterol TRUE))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SChighCholesterol TRUE)))

(defrule scoreArteriosclerosis "Score for arteriosclerois"
?patient <- (patient(arteriosclerosis TRUE) (SCarteriosclerosis FALSE) (counterVascular ?counterV))
(not(SCarteriosclerosis TRUE))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SCarteriosclerosis TRUE)))


(defrule scoreDepression "Score for depression"
?patient <- (patient(depression TRUE) (SCdepression FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SCdepression TRUE)))


(defrule scoreLowLevelsEducation "Score for low levels of education"
?patient <- (patient(lowLevelsEducation TRUE) (SClowLevelsEducation FALSE) (counterAlzheimer ?counterA))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (SClowLevelsEducation TRUE)))


(defrule scoreDifficultiesWords "Score for difficulties finding words"
?patient <- (patient(difficultiesWords TRUE) (SCdifficultiesWords FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCdifficultiesWords TRUE)))


(defrule scoreMemoryProblems "Score for memory problems"
?patient <- (patient(memoryProblems TRUE) (SCmemoryProblems FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCmemoryProblems TRUE)))


(defrule scoreOrganizationProblems "Score for organization problems"
?patient <- (patient(organizationProblems TRUE) (SCorganizationProblems FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCorganizationProblems TRUE)))

(defrule scoreForgetPersonalInfo "Score for forgetting personal information"
?patient <- (patient(forgetPersonalInfo TRUE) (SCforgetPersonalInfo FALSE) (counterAlzheimer ?counterA) (counterAlzPhase ?counterAP) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCforgetPersonalInfo TRUE)))


(defrule scoreNoStandWalk "Score for not capable of standing or walkind"
?patient <- (patient(noStandWalk TRUE) (SCnoStandWalk FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1)) (SCnoStandWalk TRUE)))


(defrule scoreBradykinesiaL "Score for low bradykinesia"
?patient <- (patient(bradykinesiaL TRUE)  (SCbradykinesiaL FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCbradykinesiaL TRUE)))

(defrule scoreBradykinesiaM "Score for medium bradykinesia"
?patient <- (patient(bradykinesiaM TRUE)  (SCbradykinesiaM FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCbradykinesiaM TRUE)))

(defrule scoreBradykinesiaH "Score for high bradykinesia"
?patient <- (patient(bradykinesiaH TRUE)  (SCbradykinesiaH FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCbradykinesiaH TRUE)))


(defrule scoreOrientationImpL "Score for low orientation impairment"
?patient <- (patient(orientationImpL TRUE)  (SCorientationImpL FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCorientationImpL TRUE)))


(defrule scoreOrientationImpH "Score for high orientation impairment"
?patient <- (patient(orientationImpH TRUE)  (SCorientationImpH FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCorientationImpH TRUE)))


(defrule scoreBehaviour "Score for behaviour changes"
?patient <- (patient(behaviour TRUE)  (SCbehaviour FALSE) (counterAlzheimer ?counterA) (counterVascular ?counterV))
=>
(modify ?patient (counterAlzheimer (+ ?counterA 1)) (counterVascular (+ ?counterV 1)) (SCbehaviour TRUE)))


(defrule scoreEmotionalInstability "Score for emotional instability"
?patient <- (patient(emotionalInstability TRUE)  (SCemotionalInstability FALSE) (counterVascular ?counterV))
=>
(modify ?patient (counterVascular (+ ?counterV 1)) (SCemotionalInstability TRUE)))

(defrule scoreChemicalsExposure "Score for chemical exposure"
?patient <- (patient(chemicalsExposure TRUE) (SCchemicalsExposure FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCchemicalsExposure TRUE)))

(defrule scoreDrugConsumption "Score for drug consumption"
?patient <- (patient(drugConsumption TRUE) (SCdrugConsumption FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCdrugConsumption TRUE)))

(defrule scoreTremor "Score for tremor"
?patient <- (patient(tremor TRUE) (SCtremor FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCtremor TRUE)))

(defrule scoreStiffness "Score for stiffness"
?patient <- (patient(stiffness TRUE) (SCstiffness FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCstiffness TRUE)))

(defrule scoreBalanceLoss "Score for balanceLoss"
?patient <- (patient(balanceLoss TRUE) (SCbalanceLoss FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCbalanceLoss TRUE)))

(defrule scoreStraightWalking "Score for straight walking problems"
?patient <- (patient(straightWalkingProblems TRUE) (SCstraightWalkingProblems FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCstraightWalkingProblems TRUE)))

(defrule scoreSmellLoss "Score for smell loss"
?patient <- (patient(smellLoss TRUE) (SCsmellLoss FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCsmellLoss TRUE)))

(defrule scoreIncontinence "Score for urinary and gastric incontinence"
?patient <- (patient(incontinence TRUE) (SCincontinence FALSE) (counterVascular ?counterV))
=>
(modify ?patient (counterVascular (+ ?counterV 1))(SCincontinence TRUE)))

(defrule scoreSleepingProblems "Score for sleeping problems"
?patient <- (patient(sleepingProblems TRUE) (SCsleepingProblems FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCsleepingProblems TRUE)))

(defrule scoreFacialExpressionLoss "Score for facial expression loss"
?patient <- (patient(facialExpressionLoss TRUE) (SCfacialExpressionLoss FALSE) (counterParkinson ?counterP))
=>
(modify ?patient (counterParkinson (+ ?counterP 1))(SCfacialExpressionLoss TRUE)))


;----------CALCULATION TO SEE WHICH DISEASE THE PATIENT HAS----------------
(defrule noDementia "Patient has no dementia"
?patient <- (patient (noDementia FALSE) (counterParkinson ?counterP) (counterAlzheimer ?counterA) (counterVascular ?counterV))
(and (test (< ?counterP 4))(test (< ?counterA 4))(test (< ?counterV 4)))
=>
(printout t "Diagnosis is: patient has NO DEMENTIA!" crlf)
(modify ?patient (noDementia TRUE)))


(defrule parkinson "Patient has Parkinson disease"
?patient <- (patient (noDementia FALSE) (parkinson FALSE) (counterParkinson ?counterP) (counterAlzheimer ?counterA) (counterVascular ?counterV))
(and (test(> ?counterP ?counterA))(test (> ?counterP ?counterV))(test (> ?counterP 3)))
=>
(printout t "Diagnosis is: patient has PARKINSON DISEASE" crlf)
(modify ?patient (parkinson TRUE)))


(defrule alzheimer "Patient has Alzheimer disease"
?patient <- (patient (noDementia FALSE) (alzheimer FALSE) (counterParkinson ?counterP) (counterAlzheimer ?counterA) (counterVascular ?counterV))
(and (test (> ?counterA ?counterP))(test (> ?counterA ?counterV))(test (> ?counterA 3)))
=>
(printout t "Diagnosis is: patient has ALZHEIMER DISEASE" crlf)
(modify ?patient (alzheimer TRUE)))


(defrule vascular "Patient has Vascular dementia"
?patient <- (patient (noDementia FALSE) (vascular FALSE) (counterParkinson ?counterP) (counterAlzheimer ?counterA) (counterVascular ?counterV))
(and (test (> ?counterV ?counterA))(test (> ?counterV ?counterP))(test (> ?counterV 3)))
=>
(printout t "Diagnosis is: patient has VASCULAR DEMENTIA" crlf)
(modify ?patient (vascular TRUE)))


;---------- CALCULUS TO SEE WHICH PHASE OF THE DISEASE THE PATIENT HAS ----------------
; --------- PARKINSON ----------
; ---------------------- RULES TO MAKE PHASE SCORE CALCULATIONS ----------------------
(defrule scoreNoStandWalkP "Score for no standing or walking for parkinson"
?patient <- (patient (parkinson TRUE) (noStandWalk TRUE) (SCnoStandWalkP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCnoStandWalkP TRUE)))


(defrule scoreLostPhysicalAbilityP "Score for lost physical ability for parkinson"
?patient <- (patient (parkinson TRUE) (lostPhysicalAbilityP TRUE) (SClostPhysicalAbilityP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SClostPhysicalAbilityP TRUE)))


(defrule scoreBradykinesiaLMP "Score for low or medium bradykinesia for parkinson"
?patient <- (patient (parkinson TRUE) (bradykinesiaL TRUE) (bradykinesiaM TRUE) (SCbradykinesiaLMP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCbradykinesiaLMP TRUE)))

(defrule scoreBradykinesiaHP "Score for high bradykinesia for parkinson"
?patient <- (patient (parkinson TRUE) (bradykinesiaH TRUE) (SCbradykinesiaHP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCbradykinesiaHP TRUE)))


(defrule scoreTremorUnilP "Score for unilateral tremor for parkinson"
?patient <- (patient (parkinson TRUE) (tremorUnilP TRUE) (SCtremorUnilP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCtremorUnilP TRUE)))


(defrule scoreTremorBilP "Score for bilateral tremor for parkinson"
?patient <- (patient (parkinson TRUE) (tremorBilP TRUE) (SCtremorBilP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCtremorBilP TRUE)))


(defrule scoreStiffnessP "Score for stiffness for parkinson"
?patient <- (patient (parkinson TRUE) (stiffness TRUE) (SCstiffnessP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCstiffnessP TRUE)))


(defrule scoreLossOfCoordinationP "Score for loss of coordination for parkinson"
?patient <- (patient (parkinson TRUE) (lossOfCoordination TRUE) (SClossOfCoordinationP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SClossOfCoordinationP TRUE)))


(defrule scoreIncontinenceP "Score for incontinence for parkinson"
?patient <- (patient (parkinson TRUE) (incontinence TRUE) (SCincontinenceP FALSE) (counterParPhase ?counterPP))
=>
(modify ?patient (counterParPhase (+ ?counterPP 1))(SCincontinenceP TRUE)))


; --------------------------- RULES TO CHECK PARKINSON PHASE ---------------------------
(defrule parkinsonP1 "Patient has parkinson phase 1"
?patient <- (patient (parkinson TRUE) (parkinsonP1 FALSE) (counterParPhase ?counterPP))
(test (< ?counterPP 3))
=>
(modify ?patient (parkinsonP1 TRUE))
(printout t "Patient has PARKINSON PHASES 1-2." crlf))


(defrule parkinsonP2 "Patient has parkinson phase 2"
?patient <- (patient (parkinson TRUE) (parkinsonP2 FALSE) (counterParPhase ?counterPP))
(and (test (> ?counterPP 2)) (test (< ?counterPP 8)))
=>
(modify ?patient (parkinsonP2 TRUE))
(printout t "Patient has PARKINSON PHASES 3-4." crlf))


(defrule parkinsonP3 "Patient has parkinson phase 3"
?patient <- (patient (parkinson TRUE) (parkinsonP3 FALSE) (counterParPhase ?counterPP))
(test (> ?counterPP 7))
=>
(modify ?patient (parkinsonP3 TRUE))
(printout t "Patient has PARKINSON PHASE 5." crlf))


; --------- ALZHEIMER ----------
; ---------------------- RULES TO MAKE PHASE SCORE CALCULATIONS ----------------------
(defrule scoreForgetPersonalInfoAP2and3 "Score for forget personal info for Alzheimer"
?patient <- (patient (alzheimer TRUE) (forgetPersonalInfo TRUE) (SCforgetPersonalInfoAP2and3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCforgetPersonalInfoAP2and3 TRUE)))


(defrule scoreLostPhysicalAbilityA "Score for lost physical ability for Alzheimer"
?patient <- (patient (alzheimer TRUE) (lostPhysicalAbilityA TRUE) (SClostPhysicalAbilityA FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SClostPhysicalAbilityA TRUE)))


(defrule scoreOrientationImpLAP2 "Score for low orientation impairment for Alzheimer"
?patient <- (patient (alzheimer TRUE) (orientationImpL TRUE) (SCorientationImpLAP2 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCorientationImpLAP2 TRUE)))


(defrule scoreOrientationImpHAP3 "Score for low orientation impairment for Alzheimer"
?patient <- (patient (alzheimer TRUE) (orientationImpH TRUE) (SCorientationImpHAP3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCorientationImpHAP3 TRUE)))


(defrule scoreBehaviourA "Score for changes in behaviour for Alzheimer"
?patient <- (patient (alzheimer TRUE) (behaviour TRUE) (SCbehaviourAP2and3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCbehaviourAP2and3 TRUE)))


(defrule scoreEmotionalInstabilityAP2and3 "Score for emotional instability for Alzheimer"
?patient <- (patient (alzheimer TRUE) (emotionalInstability TRUE) (SCemotionalInstabilityAP2and3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCemotionalInstabilityAP2and3 TRUE)))


(defrule scoreStiffnessLAP2 "Score for low stiffness for Alzheimer"
?patient <- (patient (alzheimer TRUE) (stiffnessLAP2 TRUE) (SCstiffnessLAP2 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCstiffnessLAP2 TRUE)))


(defrule scoreStiffnessHAP3 "Score for high stiffness for Alzheimer"
?patient <- (patient (alzheimer TRUE) (stiffnessHAP3 TRUE) (SCstiffnessHAP3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCstiffnessHAP3 TRUE)))


(defrule scoreLossOfCoordinationAP3 "Score for precision problems or loss of coordination for Alzheimer"
?patient <- (patient (alzheimer TRUE) (lossOfCoordination TRUE) (SClossOfCoordinationAP3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SClossOfCoordinationAP3 TRUE)))


(defrule scoreIncontinenceA "Score for incontinence for alzheimer"
?patient <- (patient (alzheimer TRUE) (incontinence TRUE) (SCincontinenceAP3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCincontinenceAP3 TRUE)))


(defrule scoreSleepingProblemsAP3 "Score for sleeping problems for alzheimer"
?patient <- (patient (alzheimer TRUE) (sleepingProblems TRUE) (SCsleepingProblemsAP3 FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SCsleepingProblemsAP3 TRUE)))


(defrule scoreHyperreflexiaA "Score for hyperreflexia for alzheimer"
?patient <- (patient (alzheimer TRUE) (hyperreflexiaA TRUE) (SChyperreflexiaA FALSE) (counterAlzPhase ?counterPA))
=>
(modify ?patient (counterAlzPhase (+ ?counterPA 1))(SChyperreflexiaA TRUE)))

; --------------------------- RULES TO CHECK ALZHEIMER PHASE ---------------------------
(defrule alzheimerP1 "Patient has alzheimer phase 1"
?patient <- (patient (alzheimer TRUE) (alzheimerP1 FALSE) (counterAlzPhase ?counterPA))
(test (< ?counterPA 3))
=>
(modify ?patient (alzheimerP1 TRUE))
(printout t "Patient has ALZHEIMER PHASE 1." crlf))


(defrule alzheimerP2 "Patient has alzheimer phase 2"
?patient <- (patient (alzheimer TRUE) (alzheimerP2 FALSE) (counterAlzPhase ?counterPA))
(and (test (> ?counterPA 2))(test (< ?counterPA 9)))
=>
(modify ?patient (alzheimerP2 TRUE))
(printout t "Patient has ALZHEIMER PHASE 2." crlf))


(defrule alzheimerP3 "Patient has alzheimer phase 3"
?patient <- (patient (alzheimer TRUE) (alzheimerP3 FALSE) (counterAlzPhase ?counterPA))
(test (> ?counterPA 8))
=>
(modify ?patient (alzheimerP3 TRUE))
(printout t "Patient has ALZHEIMER PHASE 3." crlf))


; --------- VASCULAR DEMENTIA ----------
; --------- RULES TO MAKE PHASE SCORE CALCULATIONS -----------

(defrule scoreMemoryProblemsV "Patient loses recent information."
?patient <- (patient (vascular TRUE) (SCmemoryProblems TRUE) (SCmemoryProblemsV FALSE) 
(counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCmemoryProblemsV TRUE)))

(defrule scoreOrganizationProblemsV "Patient has difficulties in organising and planning."
?patient <- (patient (vascular TRUE) (SCorganizationProblems TRUE) 
(SCorganizationProblemsV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCorganizationProblemsV TRUE)))

(defrule scoreOrientationImpLV "Patient has low orientation impairment."
?patient <- (patient (vascular TRUE) (SCorientationImpL TRUE) 
(SCorientationImpLV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCorientationImpLV TRUE)))

(defrule scoreOrientationImpHV "Patient has high orientation impairment."
?patient <- (patient (vascular TRUE) (SCorientationImpH TRUE) 
(SCorientationImpHV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCorientationImpHV TRUE)))

(defrule scoreBehaviourV "Patient has changes in behaviour."
?patient <- (patient (vascular TRUE) (SCbehaviour TRUE) 
(SCbehaviourV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCbehaviourV TRUE)))

(defrule scoreEmotionalInstabilityV "Patient has emotional instability."
?patient <- (patient (vascular TRUE) (SCemotionalInstability TRUE) 
(SCemotionalInstabilityV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCemotionalInstabilityV TRUE)))

;(defrule scoreLossOfCoordinationV "Patient has loss of coordination, precision problems."
;?patient <- (patient (vascular TRUE) (SClossOfCoordination TRUE) 
;(SClossOfCoordinationV FALSE) (counterVasPhase ?counterVP))
;=>
;(modify ?patient (counterVasPhase (+ ?counterVP 2))(SClossOfCoordinationV TRUE)))

(defrule scoreIncontinenceV "Patient has urinary or gastric incontinence."
?patient <- (patient (vascular TRUE) (SCincontinence TRUE) 
(SCincontinenceV FALSE) (counterVasPhase ?counterVP))
=>
(modify ?patient (counterVasPhase (+ ?counterVP 2))(SCincontinenceV TRUE)))

; --------------------------- RULES TO CHECK VASCULAR PHASE ---------------------------

(defrule vascularP1 "Patient has vascular dementia phase 1"
?patient <- (patient (vascular TRUE) (vascularP1 FALSE) (counterVasPhase ?counterVP))
(test (< ?counterVP 3))
=>
(modify ?patient (vascularP1 TRUE))
(printout t "Patient has VASCULAR DEMENTIA PHASES 1-3." crlf))


(defrule vascularP2 "Patient has vascular dementia phase 2"
?patient <- (patient (vascular TRUE) (vascularP2 FALSE) (counterVasPhase ?counterVP))
(test (< ?counterVP 3))
=>
(modify ?patient (vascularP2 TRUE))
(printout t "Patient has VASCULAR DEMENTIA PHASES 4-5." crlf))


(defrule vascularP3 "Patient has vascular dementia phase 3"
?patient <- (patient (vascular TRUE) (vascularP3 FALSE) (counterVasPhase ?counterVP))
(test (< ?counterVP 3))
=>
(modify ?patient (vascularP3 TRUE))
(printout t "Patient has VASCULAR DEMENTIA PHASES 6-7." crlf))





