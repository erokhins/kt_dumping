'OverloadingConflictResolver<CallableReferenceCandidate>' @ [41:5] ==> public constructor OverloadingConflictResolver<C : Any>(builtIns: KotlinBuiltIns, specificityComparator: TypeSpecificityComparator, getResultingDescriptor: (CallableReferenceCandidate) -> CallableDescriptor, createEmptyConstraintSystem: () -> SimpleConstraintSystem, createFlatSignature: (CallableReferenceCandidate) -> FlatSignature<CallableReferenceCandidate>, getVariableCandidates: (CallableReferenceCandidate) -> CallableReferenceCandidate?, isFromSources: (CallableDescriptor) -> Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Any> -> CallableReferenceCandidate

'builtIns' @ [42:9] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>[ValueParameterDescriptorImpl]

'specificityComparator' @ [43:9] ==> value-parameter specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>[ValueParameterDescriptorImpl]

'it' @ [44:11] ==> value-parameter it: CallableReferenceCandidate defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [44:14] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'SimpleConstraintSystemImpl' @ [45:11] ==> public constructor SimpleConstraintSystemImpl(constraintInjector: ConstraintInjector, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[ClassConstructorDescriptorImpl]

'constraintInjector' @ [45:38] ==> value-parameter constraintInjector: ConstraintInjector defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [45:58] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>[ValueParameterDescriptorImpl]

'Companion' @ [46:9] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver[FakeCallableDescriptorForObject]

'statelessCallbacks' @ [48:11] ==> value-parameter statelessCallbacks: KotlinResolutionStatelessCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>[ValueParameterDescriptorImpl]

'isDescriptorFromSource' @ [48:30] ==> public abstract fun isDescriptorFromSource(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.components.KotlinResolutionStatelessCallbacks[SimpleFunctionDescriptorImpl]

'it' @ [48:53] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'FlatSignature' @ [52:17] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'createFromReflectionType' @ [52:31] ==> public final fun <T> createFromReflectionType(origin: CallableReferenceCandidate, descriptor: CallableDescriptor, numDefaults: Int, reflectionType: UnwrappedType): FlatSignature<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CallableReferenceCandidate

'candidate' @ [52:56] ==> value-parameter candidate: CallableReferenceCandidate defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'candidate' @ [52:67] ==> value-parameter candidate: CallableReferenceCandidate defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'candidate' @ [52:77] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'candidate' @ [52:88] ==> value-parameter candidate: CallableReferenceCandidate defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'numDefaults' @ [52:98] ==> public final val numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'candidate' @ [52:111] ==> value-parameter candidate: CallableReferenceCandidate defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'reflectionCandidateType' @ [52:121] ==> public final val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'resolvedAtom' @ [67:24] ==> value-parameter resolvedAtom: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'atom' @ [67:37] ==> public open val atom: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[PropertyDescriptorImpl]

'resolvedAtom' @ [68:28] ==> value-parameter resolvedAtom: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'expectedType' @ [68:41] ==> public final val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[PropertyDescriptorImpl]

'let' @ [68:55] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'csBuilder' @ [68:61] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'buildCurrentSubstitutor' @ [68:71] ==> public abstract fun buildCurrentSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [68:97] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'it' @ [68:112] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument.<anonymous>[ValueParameterDescriptorImpl]

'callComponents' @ [70:26] ==> private final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[PropertyDescriptorImpl]

'statelessCallbacks' @ [70:41] ==> public final val statelessCallbacks: KotlinResolutionStatelessCallbacks defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallComponents[PropertyDescriptorImpl]

'getScopeTowerForCallableReferenceArgument' @ [70:60] ==> public abstract fun getScopeTowerForCallableReferenceArgument(argument: CallableReferenceKotlinCallArgument): ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.KotlinResolutionStatelessCallbacks[SimpleFunctionDescriptorImpl]

'argument' @ [70:102] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'runRHSResolution' @ [71:26] ==> private final fun runRHSResolution(scopeTower: ImplicitScopeTower, callableReference: CallableReferenceKotlinCallArgument, expectedType: UnwrappedType?, compatibilityChecker: ((ConstraintSystemOperation) -> Unit) -> Unit): Set<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[SimpleFunctionDescriptorImpl]

'scopeTower' @ [71:43] ==> val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'argument' @ [71:55] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'expectedType' @ [71:65] ==> val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'csBuilder' @ [72:13] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'runTransaction' @ [72:23] ==> public abstract fun runTransaction(runOperations: ConstraintSystemOperation.() -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'invoke' @ [72:40] ==> public abstract operator fun invoke(p1: ConstraintSystemOperation): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [72:63] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'SmartList' @ [74:27] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinCallDiagnostic

'candidates' @ [76:31] ==> val candidates: Set<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'singleOrNull' @ [76:42] ==> public fun <T> Iterable<CallableReferenceCandidate>.singleOrNull(): CallableReferenceCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableReferenceCandidate

'if (chosenCandidate != null) {
            val (toFreshSubstitutor, diagnostic) = with(chosenCandidate) {
                csBuilder.checkCallableReference(argument, dispatchReceiver, extensionReceiver, candidate,
                                                 reflectionCandidateType, expectedType, scopeTower.lexicalScope.ownerDescriptor)
            }
            diagnostics.addIfNotNull(diagnostic)
            chosenCandidate.freshSubstitutor = toFreshSubstitutor
        }
        else {
            if (candidates.isEmpty()) {
                diagnostics.add(NoneCallableReferenceCandidates(argument))
            }
            else {
                diagnostics.add(CallableReferenceCandidatesAmbiguity(argument, candidates))
            }
        }' @ [77:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'chosenCandidate' @ [77:13] ==> val chosenCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'component1' @ [78:18] ==> public final operator fun component1(): FreshVariableNewTypeSubstitutor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [78:38] ==> public final operator fun component2(): KotlinCallDiagnostic? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'with' @ [78:52] ==> @InlineOnly public inline fun <T, R> with(receiver: CallableReferenceCandidate, block: CallableReferenceCandidate.() -> Pair<FreshVariableNewTypeSubstitutor, KotlinCallDiagnostic?>): Pair<FreshVariableNewTypeSubstitutor, KotlinCallDiagnostic?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableReferenceCandidate
    <R> -> Pair<FreshVariableNewTypeSubstitutor, KotlinCallDiagnostic?>

'chosenCandidate' @ [78:57] ==> val chosenCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'csBuilder' @ [79:17] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'checkCallableReference' @ [79:27] ==> public fun ConstraintSystemOperation.checkCallableReference(argument: CallableReferenceKotlinCallArgument, dispatchReceiver: CallableReceiver?, extensionReceiver: CallableReceiver?, candidateDescriptor: CallableDescriptor, reflectionCandidateType: UnwrappedType, expectedType: UnwrappedType?, ownerDescriptor: DeclarationDescriptor): Pair<FreshVariableNewTypeSubstitutor, KotlinCallDiagnostic?> defined in org.jetbrains.kotlin.resolve.calls.components[SimpleFunctionDescriptorImpl]

'argument' @ [79:50] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'dispatchReceiver' @ [79:60] ==> public final val dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'extensionReceiver' @ [79:78] ==> public final val extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'candidate' @ [79:97] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'reflectionCandidateType' @ [80:50] ==> public final val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'expectedType' @ [80:75] ==> val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'scopeTower' @ [80:89] ==> val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'lexicalScope' @ [80:100] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'ownerDescriptor' @ [80:113] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'diagnostics' @ [82:13] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'addIfNotNull' @ [82:25] ==> public fun <T : Any> MutableCollection<(KotlinCallDiagnostic..KotlinCallDiagnostic?)>.addIfNotNull(t: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic..org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic?)

'diagnostic' @ [82:38] ==> val diagnostic: KotlinCallDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'chosenCandidate' @ [83:13] ==> val chosenCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'freshSubstitutor' @ [83:29] ==> public final var freshSubstitutor: FreshVariableNewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'toFreshSubstitutor' @ [83:48] ==> val toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'if (candidates.isEmpty()) {
                diagnostics.add(NoneCallableReferenceCandidates(argument))
            }
            else {
                diagnostics.add(CallableReferenceCandidatesAmbiguity(argument, candidates))
            }' @ [86:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'candidates' @ [86:17] ==> val candidates: Set<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'isEmpty' @ [86:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [87:17] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'add' @ [87:29] ==> public open fun add(element: (KotlinCallDiagnostic..KotlinCallDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'NoneCallableReferenceCandidates' @ [87:33] ==> public constructor NoneCallableReferenceCandidates(argument: CallableReferenceKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.NoneCallableReferenceCandidates[ClassConstructorDescriptorImpl]

'argument' @ [87:65] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'diagnostics' @ [90:17] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'add' @ [90:29] ==> public open fun add(element: (KotlinCallDiagnostic..KotlinCallDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'CallableReferenceCandidatesAmbiguity' @ [90:33] ==> public constructor CallableReferenceCandidatesAmbiguity(argument: CallableReferenceKotlinCallArgument, candidates: Collection<CallableReferenceCandidate>) defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceCandidatesAmbiguity[ClassConstructorDescriptorImpl]

'argument' @ [90:70] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'candidates' @ [90:80] ==> val candidates: Set<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'listOfNotNull' @ [95:30] ==> public fun <T : Any> listOfNotNull(element: ResolvedAtom?): List<ResolvedAtom> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolvedAtom

'buildResolvedKtArgument' @ [95:44] ==> private final fun buildResolvedKtArgument(lhsResult: LHSResult): ResolvedAtom? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[SimpleFunctionDescriptorImpl]

'argument' @ [95:68] ==> val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'lhsResult' @ [95:77] ==> public abstract val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceKotlinCallArgument[PropertyDescriptorImpl]

'resolvedAtom' @ [97:9] ==> value-parameter resolvedAtom: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[ValueParameterDescriptorImpl]

'setAnalyzedResults' @ [97:22] ==> public final fun setAnalyzedResults(candidate: CallableReferenceCandidate?, subResolvedAtoms: List<ResolvedAtom>, diagnostics: Collection<KotlinCallDiagnostic>): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[SimpleFunctionDescriptorImpl]

'chosenCandidate' @ [97:41] ==> val chosenCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'subKtArguments' @ [97:58] ==> val subKtArguments: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'diagnostics' @ [97:74] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.processCallableReferenceArgument[LocalVariableDescriptor]

'lhsResult' @ [101:13] ==> value-parameter lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[ValueParameterDescriptorImpl]

'lhsResult' @ [102:31] ==> value-parameter lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[ValueParameterDescriptorImpl]

'lshCallArgument' @ [102:41] ==> public final val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Expression[PropertyDescriptorImpl]

'when(lshCallArgument) {
            is SubKotlinCallArgument -> lshCallArgument.callResult
            is ExpressionKotlinCallArgument -> ResolvedExpressionAtom(lshCallArgument)
            else -> unexpectedArgument(lshCallArgument)
        }' @ [103:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedAtom?, entry1: ResolvedAtom?, entry2: ResolvedAtom?): ResolvedAtom?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedAtom?

'lshCallArgument' @ [103:21] ==> val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[LocalVariableDescriptor]

'lshCallArgument' @ [104:41] ==> val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[LocalVariableDescriptor]

'callResult' @ [104:57] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'ResolvedExpressionAtom' @ [105:48] ==> public constructor ResolvedExpressionAtom(atom: ExpressionKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedExpressionAtom[ClassConstructorDescriptorImpl]

'lshCallArgument' @ [105:71] ==> val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[LocalVariableDescriptor]

'unexpectedArgument' @ [106:21] ==> internal fun unexpectedArgument(argument: KotlinCallArgument): Nothing defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[SimpleFunctionDescriptorImpl]

'lshCallArgument' @ [106:40] ==> val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.buildResolvedKtArgument[LocalVariableDescriptor]

'CallableReferencesCandidateFactory' @ [116:23] ==> public constructor CallableReferencesCandidateFactory(argument: CallableReferenceKotlinCallArgument, callComponents: KotlinCallComponents, scopeTower: ImplicitScopeTower, compatibilityChecker: ((ConstraintSystemOperation) -> Unit) -> Unit, expectedType: UnwrappedType?) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[ClassConstructorDescriptorImpl]

'callableReference' @ [116:58] ==> value-parameter callableReference: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'callComponents' @ [116:77] ==> private final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[PropertyDescriptorImpl]

'scopeTower' @ [116:93] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'compatibilityChecker' @ [116:105] ==> value-parameter compatibilityChecker: ((ConstraintSystemOperation) -> Unit) -> Unit defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'expectedType' @ [116:127] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'createCallableReferenceProcessor' @ [117:25] ==> public fun createCallableReferenceProcessor(factory: CallableReferencesCandidateFactory): ScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components[SimpleFunctionDescriptorImpl]

'factory' @ [117:58] ==> val factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[LocalVariableDescriptor]

'towerResolver' @ [118:26] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[PropertyDescriptorImpl]

'runResolve' @ [118:40] ==> public final fun <C : Candidate> runResolve(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<CallableReferenceCandidate>, useOrder: Boolean): Collection<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> CallableReferenceCandidate

'scopeTower' @ [118:51] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'processor' @ [118:63] ==> val processor: ScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[LocalVariableDescriptor]

'callableReferenceOverloadConflictResolver' @ [119:16] ==> private final val callableReferenceOverloadConflictResolver: CallableReferenceOverloadConflictResolver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[PropertyDescriptorImpl]

'chooseMaximallySpecificCandidates' @ [119:58] ==> public final fun chooseMaximallySpecificCandidates(candidates: Collection<CallableReferenceCandidate>, checkArgumentsMode: CheckArgumentTypesMode, discriminateGenerics: Boolean, isDebuggerContext: Boolean): Set<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceOverloadConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [120:17] ==> val candidates: Collection<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [121:40] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'scopeTower' @ [123:37] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver.runRHSResolution[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [123:48] ==> public abstract val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

