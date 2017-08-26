'SimpleHolder' @ [40:56] ==> public constructor SimpleHolder() defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[ClassConstructorDescriptorImpl]

'candidates' @ [41:13] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'isEmpty' @ [41:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'diagnosticHolder' @ [42:13] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'addDiagnostic' @ [42:30] ==> public open fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'NoneCandidatesCallDiagnostic' @ [42:44] ==> public constructor NoneCandidatesCallDiagnostic(kotlinCall: KotlinCall) defined in org.jetbrains.kotlin.resolve.calls.model.NoneCandidatesCallDiagnostic[ClassConstructorDescriptorImpl]

'factory' @ [42:73] ==> value-parameter factory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'kotlinCall' @ [42:81] ==> public final val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[PropertyDescriptorImpl]

'candidates' @ [44:13] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'size' @ [44:24] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'diagnosticHolder' @ [45:13] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'addDiagnostic' @ [45:30] ==> public open fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'ManyCandidatesCallDiagnostic' @ [45:44] ==> public constructor ManyCandidatesCallDiagnostic(kotlinCall: KotlinCall, candidates: Collection<KotlinResolutionCandidate>) defined in org.jetbrains.kotlin.resolve.calls.model.ManyCandidatesCallDiagnostic[ClassConstructorDescriptorImpl]

'factory' @ [45:73] ==> value-parameter factory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'kotlinCall' @ [45:81] ==> public final val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[PropertyDescriptorImpl]

'candidates' @ [45:93] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'candidates' @ [47:25] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'singleOrNull' @ [47:36] ==> public fun <T> Iterable<KotlinResolutionCandidate>.singleOrNull(): KotlinResolutionCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinResolutionCandidate

'candidate' @ [50:9] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [50:20] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'let' @ [50:34] ==> @InlineOnly public inline fun <T, R> MutableResolvedCallAtom.let(block: (MutableResolvedCallAtom) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableResolvedCallAtom
    <R> -> Unit

'resolutionCallbacks' @ [50:40] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'bindStubResolvedCallForCandidate' @ [50:60] ==> public abstract fun bindStubResolvedCallForCandidate(candidate: ResolvedCallAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.components.KotlinResolutionCallbacks[SimpleFunctionDescriptorImpl]

'it' @ [50:93] ==> value-parameter it: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [52:13] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'candidate' @ [52:34] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'csBuilder' @ [52:44] ==> internal final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'hasContradiction' @ [52:54] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[PropertyDescriptorImpl]

'candidate' @ [53:42] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'factory' @ [53:55] ==> value-parameter factory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'createErrorCandidate' @ [53:63] ==> public final fun createErrorCandidate(): KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[SimpleFunctionDescriptorImpl]

'forceResolution' @ [53:86] ==> public fun <C : Candidate> KotlinResolutionCandidate.forceResolution(): KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'candidateForCompletion' @ [54:13] ==> val candidateForCompletion: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'prepareForCompletion' @ [54:36] ==> private final fun KotlinResolutionCandidate.prepareForCompletion(expectedType: UnwrappedType?): KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'expectedType' @ [54:57] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'factory' @ [55:17] ==> value-parameter factory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'kotlinCall' @ [55:25] ==> public final val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[PropertyDescriptorImpl]

'name' @ [55:36] ==> public abstract val name: Name defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'asString' @ [55:41] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'runCompletion' @ [56:17] ==> private final fun runCompletion(resolvedCallAtom: ResolvedCallAtom, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, diagnosticsHolder: KotlinDiagnosticsHolder, constraintSystem: NewConstraintSystem, resolutionCallbacks: KotlinResolutionCallbacks, skipPostponedArguments: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'candidateForCompletion' @ [56:31] ==> val candidateForCompletion: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [56:54] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'FULL' @ [56:99] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [56:105] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'candidateForCompletion' @ [56:123] ==> val candidateForCompletion: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getSystem' @ [56:146] ==> public final fun getSystem(): NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[SimpleFunctionDescriptorImpl]

'resolutionCallbacks' @ [56:159] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'candidate' @ [58:33] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getSystem' @ [58:44] ==> public final fun getSystem(): NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[SimpleFunctionDescriptorImpl]

'asReadOnlyStorage' @ [58:57] ==> public abstract fun asReadOnlyStorage(): ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[SimpleFunctionDescriptorImpl]

'Empty' @ [58:98] ==> public object Empty : ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintStorage[FakeCallableDescriptorForObject]

'CallResolutionResult' @ [59:20] ==> public constructor CallResolutionResult(type: CallResolutionResult.Type, resultCallAtom: ResolvedCallAtom?, diagnostics: List<KotlinCallDiagnostic>, constraintSystem: ConstraintStorage, allCandidates: Collection<KotlinResolutionCandidate>? = ...) defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[ClassConstructorDescriptorImpl]

'ERROR' @ [59:67] ==> enum entry ERROR defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'candidate' @ [59:74] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [59:85] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'diagnosticHolder' @ [59:99] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getDiagnostics' @ [59:116] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'systemStorage' @ [59:134] ==> val systemStorage: ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'candidate' @ [62:30] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'prepareForCompletion' @ [62:40] ==> private final fun KotlinResolutionCandidate.prepareForCompletion(expectedType: UnwrappedType?): KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'expectedType' @ [62:61] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'candidate' @ [63:32] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getSystem' @ [63:42] ==> public final fun getSystem(): NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[SimpleFunctionDescriptorImpl]

'runCompletion' @ [64:9] ==> private final fun runCompletion(resolvedCallAtom: ResolvedCallAtom, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, diagnosticsHolder: KotlinDiagnosticsHolder, constraintSystem: NewConstraintSystem, resolutionCallbacks: KotlinResolutionCallbacks, skipPostponedArguments: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'candidate' @ [64:23] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [64:33] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'completionType' @ [64:47] ==> val completionType: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'diagnosticHolder' @ [64:63] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'constraintSystem' @ [64:81] ==> val constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolutionCallbacks' @ [64:99] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'if (completionType == ConstraintSystemCompletionMode.FULL) {
            CallResolutionResult(CallResolutionResult.Type.COMPLETED, candidate.resolvedCall, diagnosticHolder.getDiagnostics(), constraintSystem.asReadOnlyStorage())
        }
        else {
            CallResolutionResult(CallResolutionResult.Type.PARTIAL, candidate.resolvedCall, diagnosticHolder.getDiagnostics(), constraintSystem.asReadOnlyStorage())
        }' @ [66:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallResolutionResult, elseBranch: CallResolutionResult): CallResolutionResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallResolutionResult

'completionType' @ [66:20] ==> val completionType: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'FULL' @ [66:69] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'CallResolutionResult' @ [67:13] ==> public constructor CallResolutionResult(type: CallResolutionResult.Type, resultCallAtom: ResolvedCallAtom?, diagnostics: List<KotlinCallDiagnostic>, constraintSystem: ConstraintStorage, allCandidates: Collection<KotlinResolutionCandidate>? = ...) defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[ClassConstructorDescriptorImpl]

'COMPLETED' @ [67:60] ==> enum entry COMPLETED defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'candidate' @ [67:71] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [67:81] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'diagnosticHolder' @ [67:95] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getDiagnostics' @ [67:112] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'constraintSystem' @ [67:130] ==> val constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'asReadOnlyStorage' @ [67:147] ==> public abstract fun asReadOnlyStorage(): ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[SimpleFunctionDescriptorImpl]

'CallResolutionResult' @ [70:13] ==> public constructor CallResolutionResult(type: CallResolutionResult.Type, resultCallAtom: ResolvedCallAtom?, diagnostics: List<KotlinCallDiagnostic>, constraintSystem: ConstraintStorage, allCandidates: Collection<KotlinResolutionCandidate>? = ...) defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[ClassConstructorDescriptorImpl]

'PARTIAL' @ [70:60] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'candidate' @ [70:69] ==> val candidate: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'resolvedCall' @ [70:79] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'diagnosticHolder' @ [70:93] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'getDiagnostics' @ [70:110] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'constraintSystem' @ [70:128] ==> val constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'asReadOnlyStorage' @ [70:145] ==> public abstract fun asReadOnlyStorage(): ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[SimpleFunctionDescriptorImpl]

'SimpleHolder' @ [79:57] ==> public constructor SimpleHolder() defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[ClassConstructorDescriptorImpl]

'candidates' @ [80:27] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[ValueParameterDescriptorImpl]

'candidate' @ [81:13] ==> val candidate: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[LocalVariableDescriptor]

'prepareForCompletion' @ [81:23] ==> private final fun KotlinResolutionCandidate.prepareForCompletion(expectedType: UnwrappedType?): KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'expectedType' @ [81:44] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[ValueParameterDescriptorImpl]

'runCompletion' @ [82:13] ==> private final fun runCompletion(resolvedCallAtom: ResolvedCallAtom, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, diagnosticsHolder: KotlinDiagnosticsHolder, constraintSystem: NewConstraintSystem, resolutionCallbacks: KotlinResolutionCallbacks, skipPostponedArguments: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'candidate' @ [83:21] ==> val candidate: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[LocalVariableDescriptor]

'resolvedCall' @ [83:31] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'FULL' @ [84:52] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'diagnosticsHolder' @ [85:21] ==> val diagnosticsHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[LocalVariableDescriptor]

'candidate' @ [86:21] ==> val candidate: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[LocalVariableDescriptor]

'getSystem' @ [86:31] ==> public final fun getSystem(): NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[SimpleFunctionDescriptorImpl]

'resolutionCallbacks' @ [87:21] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[ValueParameterDescriptorImpl]

'CallResolutionResult' @ [90:16] ==> public constructor CallResolutionResult(type: CallResolutionResult.Type, resultCallAtom: ResolvedCallAtom?, diagnostics: List<KotlinCallDiagnostic>, constraintSystem: ConstraintStorage, allCandidates: Collection<KotlinResolutionCandidate>? = ...) defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[ClassConstructorDescriptorImpl]

'ALL_CANDIDATES' @ [90:63] ==> enum entry ALL_CANDIDATES defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'emptyList' @ [90:85] ==> public fun <T> emptyList(): List<KotlinCallDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'Empty' @ [90:116] ==> public object Empty : ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintStorage[FakeCallableDescriptorForObject]

'candidates' @ [90:123] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.createAllCandidatesResult[ValueParameterDescriptorImpl]

'resolvedCallAtom' @ [101:26] ==> value-parameter resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'freshReturnType' @ [101:43] ==> public val ResolvedCallAtom.freshReturnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model in file ResolutionAtoms.kt[PropertyDescriptorImpl]

'constraintSystem' @ [101:62] ==> value-parameter constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'builtIns' @ [101:79] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[PropertyDescriptorImpl]

'unitType' @ [101:88] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'kotlinConstraintSystemCompleter' @ [102:9] ==> private final val kotlinConstraintSystemCompleter: KotlinConstraintSystemCompleter defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[PropertyDescriptorImpl]

'runCompletion' @ [102:41] ==> public final fun runCompletion(c: KotlinConstraintSystemCompleter.Context, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, topLevelPrimitive: ResolvedAtom, topLevelType: UnwrappedType, analyze: (PostponedResolvedAtom) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'constraintSystem' @ [102:55] ==> value-parameter constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'asConstraintSystemCompleterContext' @ [102:72] ==> public abstract fun asConstraintSystemCompleterContext(): KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[SimpleFunctionDescriptorImpl]

'completionMode' @ [102:110] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'resolvedCallAtom' @ [102:126] ==> value-parameter resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'returnType' @ [102:144] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[LocalVariableDescriptor]

'!' @ [103:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipPostponedArguments' @ [103:18] ==> value-parameter skipPostponedArguments: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'postponedArgumentsAnalyzer' @ [104:17] ==> private final val postponedArgumentsAnalyzer: PostponedArgumentsAnalyzer defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[PropertyDescriptorImpl]

'analyze' @ [104:44] ==> public final fun analyze(c: PostponedArgumentsAnalyzer.Context, resolutionCallbacks: KotlinResolutionCallbacks, argument: ResolvedAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[SimpleFunctionDescriptorImpl]

'constraintSystem' @ [104:52] ==> value-parameter constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'asPostponedArgumentsAnalyzerContext' @ [104:69] ==> public abstract fun asPostponedArgumentsAnalyzerContext(): PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[SimpleFunctionDescriptorImpl]

'resolutionCallbacks' @ [104:108] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'it' @ [104:129] ==> value-parameter it: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion.<anonymous>[ValueParameterDescriptorImpl]

'constraintSystem' @ [108:9] ==> value-parameter constraintSystem: NewConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'diagnostics' @ [108:26] ==> public abstract val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.inference.NewConstraintSystem[PropertyDescriptorImpl]

'forEach' @ [108:38] ==> @HidesMembers public inline fun <T> Iterable<KotlinCallDiagnostic>.forEach(action: (KotlinCallDiagnostic) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'diagnosticsHolder' @ [108:46] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion[ValueParameterDescriptorImpl]

'addDiagnostic' @ [108:65] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [114:39] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'candidateDescriptor' @ [114:52] ==> public open val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'returnType' @ [114:72] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'unwrap' @ [114:84] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [114:134] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'resolvedCall' @ [115:26] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'substitutor' @ [115:39] ==> public open lateinit var substitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'substituteKeepAnnotations' @ [115:51] ==> public open fun substituteKeepAnnotations(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'unsubstitutedReturnType' @ [115:77] ==> val unsubstitutedReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[LocalVariableDescriptor]

'expectedType' @ [116:13] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[ValueParameterDescriptorImpl]

'!' @ [116:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [116:48] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [116:63] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[ValueParameterDescriptorImpl]

'csBuilder' @ [117:13] ==> internal final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'addSubtypeConstraint' @ [117:23] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'returnType' @ [117:44] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[LocalVariableDescriptor]

'expectedType' @ [117:56] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[ValueParameterDescriptorImpl]

'ExpectedTypeConstraintPosition' @ [117:70] ==> public constructor ExpectedTypeConstraintPosition(topLevelCall: KotlinCall) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ExpectedTypeConstraintPosition[ClassConstructorDescriptorImpl]

'resolvedCall' @ [117:101] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'atom' @ [117:114] ==> public open val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'if (expectedType != null || csBuilder.isProperType(returnType)) {
            ConstraintSystemCompletionMode.FULL
        }
        else {
            ConstraintSystemCompletionMode.PARTIAL
        }' @ [120:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, elseBranch: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode): KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintSystemCompletionMode

'expectedType' @ [120:20] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[ValueParameterDescriptorImpl]

'csBuilder' @ [120:44] ==> internal final val csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'isProperType' @ [120:54] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'returnType' @ [120:67] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.prepareForCompletion[LocalVariableDescriptor]

'FULL' @ [121:44] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'PARTIAL' @ [124:44] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

