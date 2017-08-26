'when (argument) {
    is SimpleKotlinCallArgument -> checkSimpleArgument(csBuilder, argument, expectedType, diagnosticsHolder, isReceiver)
    is LambdaKotlinCallArgument -> preprocessLambdaArgument(csBuilder, argument, expectedType)
    is CallableReferenceKotlinCallArgument -> preprocessCallableReference(csBuilder, argument, expectedType, diagnosticsHolder)
    is CollectionLiteralKotlinCallArgument -> preprocessCollectionLiteralArgument(argument, expectedType)
    else -> unexpectedArgument(argument)
}' @ [35:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedAtom, entry1: ResolvedAtom, entry2: ResolvedAtom, entry3: ResolvedAtom, entry4: ResolvedAtom): ResolvedAtom[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedAtom

'argument' @ [35:25] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'checkSimpleArgument' @ [36:36] ==> public fun checkSimpleArgument(csBuilder: ConstraintSystemBuilder, argument: SimpleKotlinCallArgument, expectedType: UnwrappedType?, diagnosticsHolder: KotlinDiagnosticsHolder, isReceiver: Boolean): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file SimpleArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [36:56] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'argument' @ [36:67] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'expectedType' @ [36:77] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'diagnosticsHolder' @ [36:91] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'isReceiver' @ [36:110] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'preprocessLambdaArgument' @ [37:36] ==> private fun preprocessLambdaArgument(csBuilder: ConstraintSystemBuilder, argument: LambdaKotlinCallArgument, expectedType: UnwrappedType?, forceResolution: Boolean = ...): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [37:61] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'argument' @ [37:72] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'expectedType' @ [37:82] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'preprocessCallableReference' @ [38:47] ==> private fun preprocessCallableReference(csBuilder: ConstraintSystemBuilder, argument: CallableReferenceKotlinCallArgument, expectedType: UnwrappedType?, diagnosticsHolder: KotlinDiagnosticsHolder): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [38:75] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'argument' @ [38:86] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'expectedType' @ [38:96] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'diagnosticsHolder' @ [38:110] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'preprocessCollectionLiteralArgument' @ [39:47] ==> private fun preprocessCollectionLiteralArgument(collectionLiteralArgument: CollectionLiteralKotlinCallArgument, expectedType: UnwrappedType?): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'argument' @ [39:83] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'expectedType' @ [39:93] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'unexpectedArgument' @ [40:13] ==> internal fun unexpectedArgument(argument: KotlinCallArgument): Nothing defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[SimpleFunctionDescriptorImpl]

'argument' @ [40:32] ==> value-parameter argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.resolveKtPrimitive[ValueParameterDescriptorImpl]

'argument' @ [51:9] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'expectedType' @ [51:44] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'!' @ [51:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forceResolution' @ [51:69] ==> value-parameter forceResolution: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'csBuilder' @ [51:88] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'isTypeVariable' @ [51:98] ==> public abstract fun isTypeVariable(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'expectedType' @ [51:113] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'LambdaWithTypeVariableAsExpectedTypeAtom' @ [52:16] ==> public constructor LambdaWithTypeVariableAsExpectedTypeAtom(atom: LambdaKotlinCallArgument, expectedType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.model.LambdaWithTypeVariableAsExpectedTypeAtom[ClassConstructorDescriptorImpl]

'argument' @ [52:57] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'expectedType' @ [52:67] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'extractLambdaInfoFromFunctionalType' @ [55:28] ==> private fun extractLambdaInfoFromFunctionalType(expectedType: UnwrappedType?, argument: LambdaKotlinCallArgument): ResolvedLambdaAtom? defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [55:64] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'argument' @ [55:78] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'extraLambdaInfo' @ [55:91] ==> private fun extraLambdaInfo(expectedType: UnwrappedType?, argument: LambdaKotlinCallArgument, csBuilder: ConstraintSystemBuilder): ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [55:107] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'argument' @ [55:121] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'csBuilder' @ [55:131] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'expectedType' @ [57:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'createFunctionType' @ [58:26] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'csBuilder' @ [58:45] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'builtIns' @ [58:55] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[PropertyDescriptorImpl]

'Annotations' @ [58:65] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [58:77] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'resolvedArgument' @ [58:84] ==> val resolvedArgument: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'receiver' @ [58:101] ==> public final val receiver: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'resolvedArgument' @ [59:45] ==> val resolvedArgument: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'parameters' @ [59:62] ==> public final val parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'resolvedArgument' @ [59:80] ==> val resolvedArgument: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'returnType' @ [59:97] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'resolvedArgument' @ [59:109] ==> val resolvedArgument: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'isSuspend' @ [59:126] ==> public final val isSuspend: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[PropertyDescriptorImpl]

'csBuilder' @ [60:9] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [60:19] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'lambdaType' @ [60:40] ==> val lambdaType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'expectedType' @ [60:52] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'ArgumentConstraintPosition' @ [60:66] ==> public constructor ArgumentConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[ClassConstructorDescriptorImpl]

'argument' @ [60:93] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[ValueParameterDescriptorImpl]

'resolvedArgument' @ [63:12] ==> val resolvedArgument: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessLambdaArgument[LocalVariableDescriptor]

'csBuilder' @ [71:20] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'builtIns' @ [71:30] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[PropertyDescriptorImpl]

'expectedType' @ [72:21] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'isSuspendFunctionType' @ [72:35] ==> public val KotlinType.isSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'expectedType' @ [74:31] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'isNotNullOrNullableFunctionSupertype' @ [74:70] ==> public open fun isNotNullOrNullableFunctionSupertype(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [74:107] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'argument' @ [75:40] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'safeAs' @ [75:49] ==> public inline fun <reified T : Any> Any?.safeAs(): FunctionExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FunctionExpression

'TypeVariableForLambdaReturnType' @ [77:24] ==> public constructor TypeVariableForLambdaReturnType(lambdaArgument: LambdaKotlinCallArgument, builtIns: KotlinBuiltIns, name: String) defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableForLambdaReturnType[ClassConstructorDescriptorImpl]

'argument' @ [77:56] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'builtIns' @ [77:66] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'argumentAsFunctionExpression' @ [79:24] ==> val argumentAsFunctionExpression: FunctionExpression? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'receiverType' @ [79:54] ==> public abstract val receiverType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.FunctionExpression[PropertyDescriptorImpl]

'argumentAsFunctionExpression' @ [80:22] ==> val argumentAsFunctionExpression: FunctionExpression? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'returnType' @ [80:52] ==> public abstract val returnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.FunctionExpression[PropertyDescriptorImpl]

'expectedType' @ [81:22] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'arguments' @ [81:36] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'singleOrNull' @ [81:47] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [81:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [81:69] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'takeIf' @ [81:79] ==> @InlineOnly @SinceKotlin public inline fun <T> UnwrappedType.takeIf(predicate: (UnwrappedType) -> Boolean): UnwrappedType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'isFunctionSupertype' @ [81:88] ==> val isFunctionSupertype: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'typeVariable' @ [82:22] ==> val typeVariable: TypeVariableForLambdaReturnType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'defaultType' @ [82:35] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableForLambdaReturnType[PropertyDescriptorImpl]

'argument' @ [84:22] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'parametersTypes' @ [84:31] ==> public abstract val parametersTypes: Array<UnwrappedType?>? defined in org.jetbrains.kotlin.resolve.calls.model.LambdaKotlinCallArgument[PropertyDescriptorImpl]

'map' @ [84:48] ==> public inline fun <T, R> Array<out UnwrappedType?>.map(transform: (UnwrappedType?) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType?
    <R> -> UnwrappedType

'it' @ [84:54] ==> value-parameter it: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo.<anonymous>[ValueParameterDescriptorImpl]

'builtIns' @ [84:60] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'nothingType' @ [84:69] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'emptyList' @ [84:86] ==> public fun <T> emptyList(): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'returnType' @ [86:31] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'typeVariable' @ [86:45] ==> val typeVariable: TypeVariableForLambdaReturnType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'defaultType' @ [86:58] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableForLambdaReturnType[PropertyDescriptorImpl]

'newTypeVariableUsed' @ [87:9] ==> val newTypeVariableUsed: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'csBuilder' @ [87:30] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'registerVariable' @ [87:40] ==> public abstract fun registerVariable(variable: NewTypeVariable): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'typeVariable' @ [87:57] ==> val typeVariable: TypeVariableForLambdaReturnType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'ResolvedLambdaAtom' @ [89:12] ==> public constructor ResolvedLambdaAtom(atom: LambdaKotlinCallArgument, isSuspend: Boolean, receiver: UnwrappedType?, parameters: List<UnwrappedType>, returnType: UnwrappedType, typeVariableForLambdaReturnType: TypeVariableForLambdaReturnType?) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[ClassConstructorDescriptorImpl]

'argument' @ [89:31] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[ValueParameterDescriptorImpl]

'isSuspend' @ [89:41] ==> val isSuspend: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'receiverType' @ [89:52] ==> val receiverType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'parameters' @ [89:66] ==> val parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'returnType' @ [89:78] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'typeVariable' @ [89:90] ==> val typeVariable: TypeVariableForLambdaReturnType defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'takeIf' @ [89:103] ==> @InlineOnly @SinceKotlin public inline fun <T> TypeVariableForLambdaReturnType.takeIf(predicate: (TypeVariableForLambdaReturnType) -> Boolean): TypeVariableForLambdaReturnType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableForLambdaReturnType

'newTypeVariableUsed' @ [89:112] ==> val newTypeVariableUsed: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.extraLambdaInfo[LocalVariableDescriptor]

'expectedType' @ [93:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'!' @ [93:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [93:34] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'isBuiltinFunctionalType' @ [93:47] ==> public val KotlinType.isBuiltinFunctionalType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'extractLambdaParameters' @ [94:22] ==> private fun extractLambdaParameters(expectedType: UnwrappedType, argument: LambdaKotlinCallArgument): List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.components[SimpleFunctionDescriptorImpl]

'expectedType' @ [94:46] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'argument' @ [94:60] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'argument' @ [96:40] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'safeAs' @ [96:49] ==> public inline fun <reified T : Any> Any?.safeAs(): FunctionExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FunctionExpression

'argumentAsFunctionExpression' @ [97:24] ==> val argumentAsFunctionExpression: FunctionExpression? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[LocalVariableDescriptor]

'receiverType' @ [97:54] ==> public abstract val receiverType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.FunctionExpression[PropertyDescriptorImpl]

'expectedType' @ [97:70] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'getReceiverTypeFromFunctionType' @ [97:83] ==> public fun KotlinType.getReceiverTypeFromFunctionType(): KotlinType? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'unwrap' @ [97:118] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'argumentAsFunctionExpression' @ [98:22] ==> val argumentAsFunctionExpression: FunctionExpression? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[LocalVariableDescriptor]

'returnType' @ [98:52] ==> public abstract val returnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.FunctionExpression[PropertyDescriptorImpl]

'expectedType' @ [98:66] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [98:79] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'unwrap' @ [98:111] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'ResolvedLambdaAtom' @ [100:12] ==> public constructor ResolvedLambdaAtom(atom: LambdaKotlinCallArgument, isSuspend: Boolean, receiver: UnwrappedType?, parameters: List<UnwrappedType>, returnType: UnwrappedType, typeVariableForLambdaReturnType: TypeVariableForLambdaReturnType?) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[ClassConstructorDescriptorImpl]

'argument' @ [100:31] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'expectedType' @ [100:41] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[ValueParameterDescriptorImpl]

'isSuspendFunctionType' @ [100:54] ==> public val KotlinType.isSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'receiverType' @ [100:77] ==> val receiverType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[LocalVariableDescriptor]

'parameters' @ [100:91] ==> val parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[LocalVariableDescriptor]

'returnType' @ [100:103] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaInfoFromFunctionalType[LocalVariableDescriptor]

'argument' @ [104:27] ==> value-parameter argument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[ValueParameterDescriptorImpl]

'parametersTypes' @ [104:36] ==> public abstract val parametersTypes: Array<UnwrappedType?>? defined in org.jetbrains.kotlin.resolve.calls.model.LambdaKotlinCallArgument[PropertyDescriptorImpl]

'expectedType' @ [105:30] ==> value-parameter expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[ValueParameterDescriptorImpl]

'getValueParameterTypesFromFunctionType' @ [105:43] ==> public fun KotlinType.getValueParameterTypesFromFunctionType(): List<TypeProjection> defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'parametersTypes' @ [106:9] ==> val parametersTypes: Array<UnwrappedType?>? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[LocalVariableDescriptor]

'expectedParameters' @ [107:16] ==> val expectedParameters: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[LocalVariableDescriptor]

'map' @ [107:35] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> UnwrappedType

'it' @ [107:41] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [107:44] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [107:49] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'parametersTypes' @ [110:12] ==> val parametersTypes: Array<UnwrappedType?>? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[LocalVariableDescriptor]

'mapIndexed' @ [110:28] ==> public inline fun <T, R> Array<out UnwrappedType?>.mapIndexed(transform: (index: Int, UnwrappedType?) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType?
    <R> -> UnwrappedType

'type' @ [111:9] ==> value-parameter type: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters.<anonymous>[ValueParameterDescriptorImpl]

'expectedParameters' @ [111:17] ==> val expectedParameters: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[LocalVariableDescriptor]

'getOrNull' @ [111:36] ==> public fun <T> List<TypeProjection>.getOrNull(index: Int): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'index' @ [111:46] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [111:54] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [111:60] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [111:72] ==> value-parameter expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.extractLambdaParameters[ValueParameterDescriptorImpl]

'builtIns' @ [111:85] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [111:94] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'csBuilder' @ [116:29] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.transformToResolvedLambda[ValueParameterDescriptorImpl]

'buildCurrentSubstitutor' @ [116:39] ==> public abstract fun buildCurrentSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [116:65] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'expectedType' @ [116:80] ==> public final val expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.LambdaWithTypeVariableAsExpectedTypeAtom[PropertyDescriptorImpl]

'preprocessLambdaArgument' @ [117:30] ==> private fun preprocessLambdaArgument(csBuilder: ConstraintSystemBuilder, argument: LambdaKotlinCallArgument, expectedType: UnwrappedType?, forceResolution: Boolean = ...): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file PostponeArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [117:55] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.transformToResolvedLambda[ValueParameterDescriptorImpl]

'atom' @ [117:66] ==> public open val atom: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.LambdaWithTypeVariableAsExpectedTypeAtom[PropertyDescriptorImpl]

'fixedExpectedType' @ [117:72] ==> val fixedExpectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.transformToResolvedLambda[LocalVariableDescriptor]

'setAnalyzed' @ [119:5] ==> public final fun setAnalyzed(resolvedLambdaAtom: ResolvedLambdaAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.model.LambdaWithTypeVariableAsExpectedTypeAtom[SimpleFunctionDescriptorImpl]

'resolvedLambdaAtom' @ [119:17] ==> val resolvedLambdaAtom: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.transformToResolvedLambda[LocalVariableDescriptor]

'resolvedLambdaAtom' @ [121:12] ==> val resolvedLambdaAtom: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.components.transformToResolvedLambda[LocalVariableDescriptor]

'ResolvedCallableReferenceAtom' @ [130:18] ==> public constructor ResolvedCallableReferenceAtom(atom: CallableReferenceKotlinCallArgument, expectedType: UnwrappedType?) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[ClassConstructorDescriptorImpl]

'argument' @ [130:48] ==> value-parameter argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'expectedType' @ [130:58] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'expectedType' @ [131:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'result' @ [131:38] ==> val result: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[LocalVariableDescriptor]

'csBuilder' @ [133:38] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'getProperSuperTypeConstructors' @ [133:48] ==> public abstract fun getProperSuperTypeConstructors(type: UnwrappedType): List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'expectedType' @ [133:79] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'firstOrNull' @ [133:93] ==> public inline fun <T> Iterable<TypeConstructor>.firstOrNull(predicate: (TypeConstructor) -> Boolean): TypeConstructor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'!' @ [133:107] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ReflectionTypes' @ [133:108] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isPossibleExpectedCallableType' @ [133:124] ==> public final fun isPossibleExpectedCallableType(typeConstructor: TypeConstructor): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [133:155] ==> value-parameter it: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'notCallableTypeConstructor' @ [134:9] ==> val notCallableTypeConstructor: TypeConstructor? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[LocalVariableDescriptor]

'diagnosticsHolder' @ [135:9] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'addDiagnostic' @ [135:27] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'NotCallableExpectedType' @ [135:41] ==> public constructor NotCallableExpectedType(argument: CallableReferenceKotlinCallArgument, expectedType: UnwrappedType, notCallableTypeConstructor: TypeConstructor) defined in org.jetbrains.kotlin.resolve.calls.model.NotCallableExpectedType[ClassConstructorDescriptorImpl]

'argument' @ [135:65] ==> value-parameter argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'expectedType' @ [135:75] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[ValueParameterDescriptorImpl]

'notCallableTypeConstructor' @ [135:89] ==> val notCallableTypeConstructor: TypeConstructor? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[LocalVariableDescriptor]

'result' @ [137:12] ==> val result: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCallableReference[LocalVariableDescriptor]

'ResolvedCollectionLiteralAtom' @ [145:12] ==> public constructor ResolvedCollectionLiteralAtom(atom: CollectionLiteralKotlinCallArgument, expectedType: UnwrappedType?) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCollectionLiteralAtom[ClassConstructorDescriptorImpl]

'collectionLiteralArgument' @ [145:42] ==> value-parameter collectionLiteralArgument: CollectionLiteralKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCollectionLiteralArgument[ValueParameterDescriptorImpl]

'expectedType' @ [145:69] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.preprocessCollectionLiteralArgument[ValueParameterDescriptorImpl]

