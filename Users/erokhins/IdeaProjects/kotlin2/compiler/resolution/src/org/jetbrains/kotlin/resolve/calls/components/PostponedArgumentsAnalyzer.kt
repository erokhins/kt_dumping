'when (argument) {
            is ResolvedLambdaAtom -> analyzeLambda(c, resolutionCallbacks, argument)
            is LambdaWithTypeVariableAsExpectedTypeAtom -> analyzeLambda(c, resolutionCallbacks, argument.transformToResolvedLambda(c.getBuilder()))
            is ResolvedCallableReferenceAtom -> callableReferenceResolver.processCallableReferenceArgument(c.getBuilder(), argument)
            is ResolvedCollectionLiteralAtom -> TODO("Not supported")
            else -> error("Unexpected resolved primitive: ${argument.javaClass.canonicalName}")
        }' @ [52:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'argument' @ [52:15] ==> value-parameter argument: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'analyzeLambda' @ [53:38] ==> private final fun analyzeLambda(c: PostponedArgumentsAnalyzer.Context, resolutionCallbacks: KotlinResolutionCallbacks, lambda: ResolvedLambdaAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [53:52] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [53:55] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'argument' @ [53:76] ==> value-parameter argument: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'analyzeLambda' @ [54:60] ==> private final fun analyzeLambda(c: PostponedArgumentsAnalyzer.Context, resolutionCallbacks: KotlinResolutionCallbacks, lambda: ResolvedLambdaAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [54:74] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [54:77] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'argument' @ [54:98] ==> value-parameter argument: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'transformToResolvedLambda' @ [54:107] ==> public fun LambdaWithTypeVariableAsExpectedTypeAtom.transformToResolvedLambda(csBuilder: ConstraintSystemBuilder): ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'c' @ [54:133] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'getBuilder' @ [54:135] ==> public abstract fun getBuilder(): ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'callableReferenceResolver' @ [55:49] ==> private final val callableReferenceResolver: CallableReferenceResolver defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[PropertyDescriptorImpl]

'processCallableReferenceArgument' @ [55:75] ==> public final fun processCallableReferenceArgument(csBuilder: ConstraintSystemBuilder, resolvedAtom: ResolvedCallableReferenceAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceResolver[SimpleFunctionDescriptorImpl]

'c' @ [55:108] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'getBuilder' @ [55:110] ==> public abstract fun getBuilder(): ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'argument' @ [55:124] ==> value-parameter argument: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'TODO' @ [56:49] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [57:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'argument' @ [57:61] ==> value-parameter argument: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze[ValueParameterDescriptorImpl]

'javaClass' @ [57:70] ==> public val <T : Any> ResolvedAtom.javaClass: Class<ResolvedAtom> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ResolvedAtom

'canonicalName' @ [57:80] ==> public final val <T : (Any..Any?)> Class<ResolvedAtom>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ResolvedAtom

'c' @ [62:34] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'buildCurrentSubstitutor' @ [62:36] ==> public abstract fun buildCurrentSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'currentSubstitutor' @ [63:47] ==> val currentSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'safeSubstitute' @ [63:66] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [63:81] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda.substitute[ValueParameterDescriptorImpl]

'lambda' @ [65:24] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'receiver' @ [65:31] ==> public final val receiver: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'let' @ [65:41] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'lambda' @ [66:26] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'parameters' @ [66:33] ==> public final val parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'map' @ [66:44] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'calculateExpectedType' @ [67:28] ==> private final fun calculateExpectedType(lambdaReturnType: UnwrappedType, c: PostponedArgumentsAnalyzer.Context): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[SimpleFunctionDescriptorImpl]

'lambda' @ [67:50] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'returnType' @ [67:57] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'c' @ [67:69] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [69:31] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'analyzeAndGetLambdaResultArguments' @ [69:51] ==> public abstract fun analyzeAndGetLambdaResultArguments(lambdaArgument: LambdaKotlinCallArgument, isSuspend: Boolean, receiverType: UnwrappedType?, parameters: List<UnwrappedType>, expectedReturnType: UnwrappedType?): List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.KotlinResolutionCallbacks[SimpleFunctionDescriptorImpl]

'lambda' @ [69:86] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'atom' @ [69:93] ==> public open val atom: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'lambda' @ [69:99] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'isSuspend' @ [69:106] ==> public final val isSuspend: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'receiver' @ [69:117] ==> val receiver: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'parameters' @ [69:127] ==> val parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'expectedType' @ [69:139] ==> val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'resultArguments' @ [71:9] ==> val resultArguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'forEach' @ [71:25] ==> @HidesMembers public inline fun <T> Iterable<KotlinCallArgument>.forEach(action: (KotlinCallArgument) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument

'c' @ [71:35] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'addSubsystemForArgument' @ [71:37] ==> public fun PostponedArgumentsAnalyzer.Context.addSubsystemForArgument(argument: KotlinCallArgument?): Unit defined in org.jetbrains.kotlin.resolve.calls.inference in file ConstraintSystemBuilder.kt[SimpleFunctionDescriptorImpl]

'it' @ [71:61] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda.<anonymous>[ValueParameterDescriptorImpl]

'SimpleHolder' @ [73:56] ==> public constructor SimpleHolder() defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[ClassConstructorDescriptorImpl]

'resultArguments' @ [75:39] ==> val resultArguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'map' @ [75:55] ==> public inline fun <T, R> Iterable<KotlinCallArgument>.map(transform: (KotlinCallArgument) -> ResolvedAtom): List<ResolvedAtom> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument
    <R> -> ResolvedAtom

'resolveKtPrimitive' @ [76:13] ==> public fun resolveKtPrimitive(csBuilder: ConstraintSystemBuilder, argument: KotlinCallArgument, expectedType: UnwrappedType?, diagnosticsHolder: KotlinDiagnosticsHolder, isReceiver: Boolean): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'c' @ [76:32] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'getBuilder' @ [76:34] ==> public abstract fun getBuilder(): ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'it' @ [76:48] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda.<anonymous>[ValueParameterDescriptorImpl]

'lambda' @ [76:52] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'returnType' @ [76:59] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'let' @ [76:70] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'diagnosticHolder' @ [76:89] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'resultArguments' @ [78:13] ==> val resultArguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'isEmpty' @ [78:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lambda' @ [79:28] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'returnType' @ [79:35] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'builtIns' @ [79:46] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'unitType' @ [79:55] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'c' @ [80:13] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'getBuilder' @ [80:15] ==> public abstract fun getBuilder(): ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'addSubtypeConstraint' @ [80:28] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'lambda' @ [80:49] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'returnType' @ [80:56] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'let' @ [80:67] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'unitType' @ [80:86] ==> val unitType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'LambdaArgumentConstraintPosition' @ [80:96] ==> public constructor LambdaArgumentConstraintPosition(lambda: ResolvedLambdaAtom) defined in org.jetbrains.kotlin.resolve.calls.inference.model.LambdaArgumentConstraintPosition[ClassConstructorDescriptorImpl]

'lambda' @ [80:129] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'lambda' @ [83:9] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[ValueParameterDescriptorImpl]

'setAnalyzedResults' @ [83:16] ==> public final fun setAnalyzedResults(resultArguments: List<KotlinCallArgument>, subResolvedAtoms: List<ResolvedAtom>, diagnostics: Collection<KotlinCallDiagnostic>): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[SimpleFunctionDescriptorImpl]

'resultArguments' @ [83:35] ==> val resultArguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'subResolvedKtPrimitives' @ [83:52] ==> val subResolvedKtPrimitives: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'diagnosticHolder' @ [83:77] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda[LocalVariableDescriptor]

'getDiagnostics' @ [83:94] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[SimpleFunctionDescriptorImpl]

'c' @ [87:27] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[ValueParameterDescriptorImpl]

'buildCurrentSubstitutor' @ [87:29] ==> public abstract fun buildCurrentSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [87:55] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'lambdaReturnType' @ [87:70] ==> value-parameter lambdaReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[ValueParameterDescriptorImpl]

'c' @ [89:13] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[ValueParameterDescriptorImpl]

'isProperType' @ [89:15] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[SimpleFunctionDescriptorImpl]

'currentType' @ [89:28] ==> val currentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'currentType' @ [90:20] ==> val currentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'c' @ [94:35] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[ValueParameterDescriptorImpl]

'notFixedTypeVariables' @ [94:37] ==> public abstract val notFixedTypeVariables: MutableMap<TypeConstructor, MutableVariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.Context[PropertyDescriptorImpl]

'currentType' @ [94:59] ==> val currentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'constructor' @ [94:71] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'variableConstraints' @ [95:13] ==> val variableConstraints: MutableVariableWithConstraints? defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'resultTypeResolver' @ [96:30] ==> private final val resultTypeResolver: ResultTypeResolver defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer[PropertyDescriptorImpl]

'findResultTypeOrNull' @ [96:49] ==> public final fun findResultTypeOrNull(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints, direction: TypeVariableDirectionCalculator.ResolveDirection): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [96:70] ==> value-parameter c: PostponedArgumentsAnalyzer.Context defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[ValueParameterDescriptorImpl]

'variableConstraints' @ [96:73] ==> val variableConstraints: MutableVariableWithConstraints? defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'TO_SUBTYPE' @ [97:119] ==> enum entry TO_SUBTYPE defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator.ResolveDirection[FakeCallableDescriptorForObject]

'resultType' @ [98:17] ==> val resultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'isUnit' @ [98:28] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [98:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentType' @ [98:41] ==> val currentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

'isMarkedNullable' @ [98:53] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'resultType' @ [98:78] ==> val resultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.calculateExpectedType[LocalVariableDescriptor]

