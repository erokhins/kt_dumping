'analyzePostponeArgumentIfPossible' @ [57:17] ==> private final fun analyzePostponeArgumentIfPossible(c: KotlinConstraintSystemCompleter.Context, topLevelPrimitive: ResolvedAtom, analyze: (PostponedResolvedAtom) -> Unit): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'c' @ [57:51] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'topLevelPrimitive' @ [57:54] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'analyze' @ [57:73] ==> value-parameter analyze: (PostponedResolvedAtom) -> Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'getOrderedAllTypeVariables' @ [59:36] ==> private final fun getOrderedAllTypeVariables(c: KotlinConstraintSystemCompleter.Context, topLevelPrimitive: ResolvedAtom): List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'c' @ [59:63] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'topLevelPrimitive' @ [59:66] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'getOrderedNotAnalyzedPostponedArguments' @ [60:41] ==> private final fun getOrderedNotAnalyzedPostponedArguments(topLevelPrimitive: ResolvedAtom): List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'topLevelPrimitive' @ [60:81] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'variableFixationFinder' @ [61:39] ==> private final val variableFixationFinder: VariableFixationFinder defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[PropertyDescriptorImpl]

'findFirstVariableForFixation' @ [61:62] ==> public final fun findFirstVariableForFixation(c: VariableFixationFinder.Context, allTypeVariables: List<TypeConstructor>, postponedKtPrimitives: List<PostponedResolvedAtom>, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, topLevelType: UnwrappedType): VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'c' @ [62:21] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'allTypeVariables' @ [62:24] ==> val allTypeVariables: List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'postponedKtPrimitives' @ [62:42] ==> val postponedKtPrimitives: List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'completionMode' @ [62:65] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'topLevelType' @ [62:81] ==> value-parameter topLevelType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'shouldForceCallableReferenceOrLambdaResolution' @ [64:17] ==> private final fun shouldForceCallableReferenceOrLambdaResolution(completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, variableForFixation: VariableFixationFinder.VariableForFixation?): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'completionMode' @ [64:64] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'variableForFixation' @ [64:80] ==> val variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'forcePostponedAtomResolution' @ [65:21] ==> private final inline fun <reified T : PostponedResolvedAtom> forcePostponedAtomResolution(topLevelPrimitive: ResolvedAtom, analyze: (PostponedResolvedAtom) -> Unit): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PostponedResolvedAtom> -> ResolvedCallableReferenceAtom

'topLevelPrimitive' @ [65:81] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'analyze' @ [65:100] ==> value-parameter analyze: (PostponedResolvedAtom) -> Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'forcePostponedAtomResolution' @ [66:21] ==> private final inline fun <reified T : PostponedResolvedAtom> forcePostponedAtomResolution(topLevelPrimitive: ResolvedAtom, analyze: (PostponedResolvedAtom) -> Unit): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PostponedResolvedAtom> -> LambdaWithTypeVariableAsExpectedTypeAtom

'topLevelPrimitive' @ [66:92] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'analyze' @ [66:111] ==> value-parameter analyze: (PostponedResolvedAtom) -> Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'variableForFixation' @ [69:17] ==> val variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'variableForFixation' @ [70:21] ==> val variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'hasProperConstraint' @ [70:41] ==> public final val hasProperConstraint: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[PropertyDescriptorImpl]

'completionMode' @ [70:64] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'FULL' @ [70:113] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'c' @ [71:51] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'notFixedTypeVariables' @ [71:53] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[PropertyDescriptorImpl]

'variableForFixation' @ [71:75] ==> val variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'variable' @ [71:95] ==> public final val variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[PropertyDescriptorImpl]

'fixVariable' @ [73:21] ==> private final fun fixVariable(c: KotlinConstraintSystemCompleter.Context, topLevelType: UnwrappedType, variableWithConstraints: VariableWithConstraints, postponedResolveKtPrimitives: List<PostponedResolvedAtom>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'c' @ [73:33] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'topLevelType' @ [73:36] ==> value-parameter topLevelType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [73:50] ==> val variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'postponedKtPrimitives' @ [73:75] ==> val postponedKtPrimitives: List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'!' @ [75:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableForFixation' @ [75:26] ==> val variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'hasProperConstraint' @ [75:46] ==> public final val hasProperConstraint: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[PropertyDescriptorImpl]

'c' @ [76:25] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'addError' @ [76:27] ==> public abstract fun addError(error: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[SimpleFunctionDescriptorImpl]

'NotEnoughInformationForTypeParameter' @ [76:36] ==> public constructor NotEnoughInformationForTypeParameter(typeVariable: NewTypeVariable) defined in org.jetbrains.kotlin.resolve.calls.inference.model.NotEnoughInformationForTypeParameter[ClassConstructorDescriptorImpl]

'variableWithConstraints' @ [76:73] ==> val variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[LocalVariableDescriptor]

'typeVariable' @ [76:97] ==> public abstract val typeVariable: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'completionMode' @ [84:13] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'FULL' @ [84:62] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'getOrderedNotAnalyzedPostponedArguments' @ [86:13] ==> private final fun getOrderedNotAnalyzedPostponedArguments(topLevelPrimitive: ResolvedAtom): List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'topLevelPrimitive' @ [86:53] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'forEach' @ [86:72] ==> @HidesMembers public inline fun <T> Iterable<PostponedResolvedAtom>.forEach(action: (PostponedResolvedAtom) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PostponedResolvedAtom

'analyze' @ [86:80] ==> value-parameter analyze: (PostponedResolvedAtom) -> Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion[ValueParameterDescriptorImpl]

'completionMode' @ [94:13] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.shouldForceCallableReferenceOrLambdaResolution[ValueParameterDescriptorImpl]

'PARTIAL' @ [94:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'variableForFixation' @ [95:13] ==> value-parameter variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.shouldForceCallableReferenceOrLambdaResolution[ValueParameterDescriptorImpl]

'variableForFixation' @ [95:44] ==> value-parameter variableForFixation: VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.shouldForceCallableReferenceOrLambdaResolution[ValueParameterDescriptorImpl]

'hasProperConstraint' @ [95:64] ==> public final val hasProperConstraint: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[PropertyDescriptorImpl]

'getOrderedNotAnalyzedPostponedArguments' @ [102:26] ==> private final fun getOrderedNotAnalyzedPostponedArguments(topLevelPrimitive: ResolvedAtom): List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'topLevelPrimitive' @ [102:66] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.analyzePostponeArgumentIfPossible[ValueParameterDescriptorImpl]

'canWeAnalyzeIt' @ [103:17] ==> private final fun canWeAnalyzeIt(c: KotlinConstraintSystemCompleter.Context, argument: PostponedResolvedAtom): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'c' @ [103:32] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.analyzePostponeArgumentIfPossible[ValueParameterDescriptorImpl]

'argument' @ [103:35] ==> val argument: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.analyzePostponeArgumentIfPossible[LocalVariableDescriptor]

'invoke' @ [104:17] ==> public abstract operator fun invoke(p1: PostponedResolvedAtom): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'argument' @ [104:25] ==> val argument: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.analyzePostponeArgumentIfPossible[LocalVariableDescriptor]

'getOrderedNotAnalyzedPostponedArguments' @ [116:33] ==> private final fun getOrderedNotAnalyzedPostponedArguments(topLevelPrimitive: ResolvedAtom): List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[SimpleFunctionDescriptorImpl]

'topLevelPrimitive' @ [116:73] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.forcePostponedAtomResolution[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [116:92] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): T? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> T

'invoke' @ [117:9] ==> public abstract operator fun invoke(p1: PostponedResolvedAtom): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'postponedArgument' @ [117:17] ==> val postponedArgument: T defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.forcePostponedAtomResolution[LocalVariableDescriptor]

'to' @ [123:13] ==> value-parameter to: MutableList<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.process[ValueParameterDescriptorImpl]

'addIfNotNull' @ [123:16] ==> public fun <T : Any> MutableCollection<PostponedResolvedAtom>.addIfNotNull(t: PostponedResolvedAtom?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PostponedResolvedAtom

'this' @ [123:29] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.process[ReceiverParameterDescriptorImpl]

'safeAs' @ [123:34] ==> public inline fun <reified T : Any> Any?.safeAs(): PostponedResolvedAtom? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PostponedResolvedAtom

'takeUnless' @ [123:67] ==> @InlineOnly @SinceKotlin public inline fun <T> PostponedResolvedAtom.takeUnless(predicate: (PostponedResolvedAtom) -> Boolean): PostponedResolvedAtom? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PostponedResolvedAtom

'it' @ [123:80] ==> value-parameter it: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.process.<anonymous>[ValueParameterDescriptorImpl]

'analyzed' @ [123:83] ==> public final var analyzed: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.PostponedResolvedAtom[PropertyDescriptorImpl]

'analyzed' @ [125:17] ==> public final var analyzed: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedAtom[PropertyDescriptorImpl]

'subResolvedAtoms' @ [126:17] ==> public final lateinit var subResolvedAtoms: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedAtom[PropertyDescriptorImpl]

'forEach' @ [126:34] ==> @HidesMembers public inline fun <T> Iterable<ResolvedAtom>.forEach(action: (ResolvedAtom) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedAtom

'it' @ [126:44] ==> value-parameter it: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.process.<anonymous>[ValueParameterDescriptorImpl]

'process' @ [126:47] ==> local final fun ResolvedAtom.process(to: MutableList<PostponedResolvedAtom>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments[SimpleFunctionDescriptorImpl]

'to' @ [126:55] ==> value-parameter to: MutableList<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.process[ValueParameterDescriptorImpl]

'arrayListOf' @ [129:16] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PostponedResolvedAtom> /* = ArrayList<PostponedResolvedAtom> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PostponedResolvedAtom

'apply' @ [129:53] ==> @InlineOnly public inline fun <T> ArrayList<PostponedResolvedAtom> /* = ArrayList<PostponedResolvedAtom> */.apply(block: ArrayList<PostponedResolvedAtom> /* = ArrayList<PostponedResolvedAtom> */.() -> Unit): ArrayList<PostponedResolvedAtom> /* = ArrayList<PostponedResolvedAtom> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<PostponedResolvedAtom>

'topLevelPrimitive' @ [129:61] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments[ValueParameterDescriptorImpl]

'process' @ [129:79] ==> local final fun ResolvedAtom.process(to: MutableList<PostponedResolvedAtom>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments[SimpleFunctionDescriptorImpl]

'this' @ [129:87] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedNotAnalyzedPostponedArguments.<anonymous>[ReceiverParameterDescriptorImpl]

'when (this) {
                is ResolvedCallAtom -> substitutor.freshVariables
                is ResolvedCallableReferenceAtom -> candidate?.freshSubstitutor?.freshVariables.orEmpty()
                is ResolvedLambdaAtom -> listOfNotNull(typeVariableForLambdaReturnType)
                else -> emptyList()
            }' @ [134:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<NewTypeVariable>, entry1: List<NewTypeVariable>, entry2: List<NewTypeVariable>, entry3: List<NewTypeVariable>): List<NewTypeVariable>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<NewTypeVariable>

'this' @ [134:39] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process[ReceiverParameterDescriptorImpl]

'substitutor' @ [135:40] ==> public abstract val substitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[PropertyDescriptorImpl]

'freshVariables' @ [135:52] ==> public final val freshVariables: List<TypeVariableFromCallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[PropertyDescriptorImpl]

'candidate' @ [136:53] ==> public final var candidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[PropertyDescriptorImpl]

'freshSubstitutor' @ [136:64] ==> public final var freshSubstitutor: FreshVariableNewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'freshVariables' @ [136:82] ==> public final val freshVariables: List<TypeVariableFromCallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[PropertyDescriptorImpl]

'orEmpty' @ [136:97] ==> @InlineOnly public inline fun <T> List<TypeVariableFromCallableDescriptor>?.orEmpty(): List<TypeVariableFromCallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableFromCallableDescriptor

'listOfNotNull' @ [137:42] ==> public fun <T : Any> listOfNotNull(element: TypeVariableForLambdaReturnType?): List<TypeVariableForLambdaReturnType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TypeVariableForLambdaReturnType

'typeVariableForLambdaReturnType' @ [137:56] ==> public final val typeVariableForLambdaReturnType: TypeVariableForLambdaReturnType? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'emptyList' @ [138:25] ==> public fun <T> emptyList(): List<NewTypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewTypeVariable

'typeVariables' @ [140:13] ==> val typeVariables: List<NewTypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process[LocalVariableDescriptor]

'mapNotNullTo' @ [140:27] ==> public inline fun <T, R : Any, C : MutableCollection<in TypeConstructor>> Iterable<NewTypeVariable>.mapNotNullTo(destination: MutableList<TypeConstructor>, transform: (NewTypeVariable) -> TypeConstructor?): MutableList<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewTypeVariable
    <R : Any> -> TypeConstructor
    <C : MutableCollection<in R>> -> MutableList<TypeConstructor>

'to' @ [140:40] ==> value-parameter to: MutableList<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process[ValueParameterDescriptorImpl]

'it' @ [141:39] ==> value-parameter it: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process.<anonymous>[ValueParameterDescriptorImpl]

'freshTypeConstructor' @ [141:42] ==> public final val freshTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewTypeVariable[PropertyDescriptorImpl]

'typeConstructor' @ [142:17] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process.<anonymous>[LocalVariableDescriptor]

'takeIf' @ [142:33] ==> @InlineOnly @SinceKotlin public inline fun <T> TypeConstructor.takeIf(predicate: (TypeConstructor) -> Boolean): TypeConstructor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'c' @ [142:42] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[ValueParameterDescriptorImpl]

'notFixedTypeVariables' @ [142:44] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[PropertyDescriptorImpl]

'containsKey' @ [142:66] ==> public abstract fun containsKey(key: TypeConstructor): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'typeConstructor' @ [142:78] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process.<anonymous>[LocalVariableDescriptor]

'analyzed' @ [145:17] ==> public final var analyzed: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedAtom[PropertyDescriptorImpl]

'subResolvedAtoms' @ [146:17] ==> public final lateinit var subResolvedAtoms: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedAtom[PropertyDescriptorImpl]

'forEach' @ [146:34] ==> @HidesMembers public inline fun <T> Iterable<ResolvedAtom>.forEach(action: (ResolvedAtom) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedAtom

'it' @ [146:44] ==> value-parameter it: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process.<anonymous>[ValueParameterDescriptorImpl]

'process' @ [146:47] ==> local final fun ResolvedAtom.process(to: MutableList<TypeConstructor>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[SimpleFunctionDescriptorImpl]

'to' @ [146:55] ==> value-parameter to: MutableList<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.process[ValueParameterDescriptorImpl]

'arrayListOf' @ [149:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'apply' @ [149:53] ==> @InlineOnly public inline fun <T> ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */.apply(block: ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */.() -> Unit): ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<TypeConstructor>

'topLevelPrimitive' @ [149:61] ==> value-parameter topLevelPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[ValueParameterDescriptorImpl]

'process' @ [149:79] ==> local final fun ResolvedAtom.process(to: MutableList<TypeConstructor>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[SimpleFunctionDescriptorImpl]

'this' @ [149:87] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.<anonymous>[ReceiverParameterDescriptorImpl]

'assert' @ [151:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [151:16] ==> val result: ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[LocalVariableDescriptor]

'size' @ [151:23] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'c' @ [151:31] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[ValueParameterDescriptorImpl]

'notFixedTypeVariables' @ [151:33] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[PropertyDescriptorImpl]

'size' @ [151:55] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'c' @ [152:41] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[ValueParameterDescriptorImpl]

'notFixedTypeVariables' @ [152:43] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[PropertyDescriptorImpl]

'keys' @ [152:65] ==> public abstract val keys: Set<TypeConstructor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toMutableSet' @ [152:70] ==> public fun <T> Iterable<TypeConstructor>.toMutableSet(): MutableSet<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'removeAll' @ [152:85] ==> public abstract fun removeAll(elements: Collection<TypeConstructor>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'result' @ [152:95] ==> val result: ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[LocalVariableDescriptor]

'notFoundTypeVariables' @ [153:45] ==> val notFoundTypeVariables: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables.<anonymous>[LocalVariableDescriptor]

'result' @ [156:16] ==> val result: ArrayList<TypeConstructor> /* = ArrayList<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.getOrderedAllTypeVariables[LocalVariableDescriptor]

'argument' @ [161:13] ==> value-parameter argument: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.canWeAnalyzeIt[ValueParameterDescriptorImpl]

'analyzed' @ [161:22] ==> public final var analyzed: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.PostponedResolvedAtom[PropertyDescriptorImpl]

'argument' @ [163:16] ==> value-parameter argument: PostponedResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.canWeAnalyzeIt[ValueParameterDescriptorImpl]

'inputTypes' @ [163:25] ==> public abstract val inputTypes: Collection<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.model.PostponedResolvedAtom[PropertyDescriptorImpl]

'all' @ [163:36] ==> public inline fun <T> Iterable<UnwrappedType>.all(predicate: (UnwrappedType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'c' @ [163:42] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.canWeAnalyzeIt[ValueParameterDescriptorImpl]

'canBeProper' @ [163:44] ==> public abstract fun canBeProper(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[SimpleFunctionDescriptorImpl]

'it' @ [163:56] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.canWeAnalyzeIt.<anonymous>[ValueParameterDescriptorImpl]

'TypeVariableDirectionCalculator' @ [172:25] ==> public constructor TypeVariableDirectionCalculator(c: VariableFixationFinder.Context, postponedKtPrimitives: List<PostponedResolvedAtom>, topLevelType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator[ClassConstructorDescriptorImpl]

'c' @ [172:57] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'postponedResolveKtPrimitives' @ [172:60] ==> value-parameter postponedResolveKtPrimitives: List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'topLevelType' @ [172:90] ==> value-parameter topLevelType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'getDirection' @ [172:104] ==> public final fun getDirection(typeVariable: Variable /* = VariableWithConstraints */): TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator[SimpleFunctionDescriptorImpl]

'variableWithConstraints' @ [172:117] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'resultTypeResolver' @ [174:26] ==> private final val resultTypeResolver: ResultTypeResolver defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter[PropertyDescriptorImpl]

'findResultType' @ [174:45] ==> public final fun findResultType(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints, direction: TypeVariableDirectionCalculator.ResolveDirection): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [174:60] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [174:63] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'direction' @ [174:88] ==> val direction: TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[LocalVariableDescriptor]

'c' @ [176:9] ==> value-parameter c: KotlinConstraintSystemCompleter.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'fixVariable' @ [176:11] ==> public abstract fun fixVariable(variable: NewTypeVariable, resultType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.Context[SimpleFunctionDescriptorImpl]

'variableWithConstraints' @ [176:23] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[ValueParameterDescriptorImpl]

'typeVariable' @ [176:47] ==> public abstract val typeVariable: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'resultType' @ [176:61] ==> val resultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.fixVariable[LocalVariableDescriptor]

