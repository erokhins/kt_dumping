'when (argument) {
    is ExpressionKotlinCallArgument -> checkExpressionArgument(csBuilder, argument, expectedType, diagnosticsHolder, isReceiver)
    is SubKotlinCallArgument -> checkSubCallArgument(csBuilder, argument, expectedType, diagnosticsHolder, isReceiver)
    else -> unexpectedArgument(argument)
}' @ [41:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedAtom, entry1: ResolvedAtom, entry2: ResolvedAtom): ResolvedAtom[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedAtom

'argument' @ [41:25] ==> value-parameter argument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'checkExpressionArgument' @ [42:40] ==> private fun checkExpressionArgument(csBuilder: ConstraintSystemBuilder, expressionArgument: ExpressionKotlinCallArgument, expectedType: UnwrappedType?, diagnosticsHolder: KotlinDiagnosticsHolder, isReceiver: Boolean): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file SimpleArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [42:64] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'argument' @ [42:75] ==> value-parameter argument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'expectedType' @ [42:85] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'diagnosticsHolder' @ [42:99] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'isReceiver' @ [42:118] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'checkSubCallArgument' @ [43:33] ==> private fun checkSubCallArgument(csBuilder: ConstraintSystemBuilder, subCallArgument: SubKotlinCallArgument, expectedType: UnwrappedType?, diagnosticsHolder: KotlinDiagnosticsHolder, isReceiver: Boolean): ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.components in file SimpleArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'csBuilder' @ [43:54] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'argument' @ [43:65] ==> value-parameter argument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'expectedType' @ [43:75] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'diagnosticsHolder' @ [43:89] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'isReceiver' @ [43:108] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'unexpectedArgument' @ [44:13] ==> internal fun unexpectedArgument(argument: KotlinCallArgument): Nothing defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[SimpleFunctionDescriptorImpl]

'argument' @ [44:32] ==> value-parameter argument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSimpleArgument[ValueParameterDescriptorImpl]

'ResolvedExpressionAtom' @ [54:32] ==> public constructor ResolvedExpressionAtom(atom: ExpressionKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedExpressionAtom[ClassConstructorDescriptorImpl]

'expressionArgument' @ [54:55] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'expectedType' @ [55:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'resolvedKtExpression' @ [55:38] ==> val resolvedKtExpression: ResolvedExpressionAtom defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'captureFromTypeParameterUpperBoundIfNeeded' @ [58:24] ==> private fun captureFromTypeParameterUpperBoundIfNeeded(argumentType: UnwrappedType, expectedType: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components in file SimpleArgumentsChecks.kt[SimpleFunctionDescriptorImpl]

'expressionArgument' @ [58:67] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'receiver' @ [58:86] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'stableType' @ [58:95] ==> internal val ReceiverValueWithSmartCastInfo.stableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'expectedType' @ [58:107] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'unstableType' @ [63:13] ==> value-parameter unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'csBuilder' @ [64:17] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [64:27] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'unstableType' @ [64:60] ==> value-parameter unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'actualExpectedType' @ [64:74] ==> value-parameter actualExpectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'position' @ [64:94] ==> value-parameter position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'UnstableSmartCast' @ [65:24] ==> public constructor UnstableSmartCast(argument: ExpressionKotlinCallArgument, targetType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[ClassConstructorDescriptorImpl]

'expressionArgument' @ [65:42] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'unstableType' @ [65:62] ==> value-parameter unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'csBuilder' @ [68:9] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [68:19] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'argumentType' @ [68:40] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'actualExpectedType' @ [68:54] ==> value-parameter actualExpectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'position' @ [68:74] ==> value-parameter position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument.unstableSmartCastOrSubtypeError[ValueParameterDescriptorImpl]

'expectedType' @ [72:32] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [72:45] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'if (isReceiver) ReceiverConstraintPosition(expressionArgument) else ArgumentConstraintPosition(expressionArgument)' @ [73:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintPosition, elseBranch: ConstraintPosition): ConstraintPosition[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintPosition

'isReceiver' @ [73:24] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'ReceiverConstraintPosition' @ [73:36] ==> public constructor ReceiverConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ReceiverConstraintPosition[ClassConstructorDescriptorImpl]

'expressionArgument' @ [73:63] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'ArgumentConstraintPosition' @ [73:88] ==> public constructor ArgumentConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[ClassConstructorDescriptorImpl]

'expressionArgument' @ [73:115] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'expressionArgument' @ [74:9] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'isSafeCall' @ [74:28] ==> public abstract val isSafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'csBuilder' @ [75:14] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [75:24] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'argumentType' @ [75:57] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedNullableType' @ [75:71] ==> val expectedNullableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'position' @ [75:93] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'diagnosticsHolder' @ [76:13] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addDiagnosticIfNotNull' @ [76:31] ==> public fun KotlinDiagnosticsHolder.addDiagnosticIfNotNull(diagnostic: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file ResolutionCandidate.kt[SimpleFunctionDescriptorImpl]

'unstableSmartCastOrSubtypeError' @ [77:21] ==> local final fun unstableSmartCastOrSubtypeError(unstableType: UnwrappedType?, actualExpectedType: UnwrappedType, position: ConstraintPosition): KotlinCallDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[SimpleFunctionDescriptorImpl]

'expressionArgument' @ [77:53] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'receiver' @ [77:72] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'unstableType' @ [77:81] ==> internal val ReceiverValueWithSmartCastInfo.unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'expectedNullableType' @ [77:95] ==> val expectedNullableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'position' @ [77:117] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'resolvedKtExpression' @ [79:16] ==> val resolvedKtExpression: ResolvedExpressionAtom defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'!' @ [82:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'csBuilder' @ [82:10] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [82:20] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'argumentType' @ [82:53] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedType' @ [82:67] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'position' @ [82:81] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReceiver' @ [83:14] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'diagnosticsHolder' @ [84:13] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addDiagnosticIfNotNull' @ [84:31] ==> public fun KotlinDiagnosticsHolder.addDiagnosticIfNotNull(diagnostic: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file ResolutionCandidate.kt[SimpleFunctionDescriptorImpl]

'unstableSmartCastOrSubtypeError' @ [84:54] ==> local final fun unstableSmartCastOrSubtypeError(unstableType: UnwrappedType?, actualExpectedType: UnwrappedType, position: ConstraintPosition): KotlinCallDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[SimpleFunctionDescriptorImpl]

'expressionArgument' @ [84:86] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'receiver' @ [84:105] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'unstableType' @ [84:114] ==> internal val ReceiverValueWithSmartCastInfo.unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'expectedType' @ [84:128] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'position' @ [84:142] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'resolvedKtExpression' @ [85:20] ==> val resolvedKtExpression: ResolvedExpressionAtom defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expressionArgument' @ [88:28] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'receiver' @ [88:47] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[PropertyDescriptorImpl]

'unstableType' @ [88:56] ==> internal val ReceiverValueWithSmartCastInfo.unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'if (unstableType != null && csBuilder.addSubtypeConstraintIfCompatible(unstableType, expectedType, position)) {
            diagnosticsHolder.addDiagnostic(UnstableSmartCast(expressionArgument, unstableType))
        }
        else if (csBuilder.addSubtypeConstraintIfCompatible(argumentType, expectedNullableType, position)) {
            diagnosticsHolder.addDiagnostic(UnsafeCallError(expressionArgument))
        }
        else {
            csBuilder.addSubtypeConstraint(argumentType, expectedType, position)
        }' @ [89:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'unstableType' @ [89:13] ==> val unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'csBuilder' @ [89:37] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [89:47] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'unstableType' @ [89:80] ==> val unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedType' @ [89:94] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'position' @ [89:108] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'diagnosticsHolder' @ [90:13] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addDiagnostic' @ [90:31] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'UnstableSmartCast' @ [90:45] ==> public constructor UnstableSmartCast(argument: ExpressionKotlinCallArgument, targetType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[ClassConstructorDescriptorImpl]

'expressionArgument' @ [90:63] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'unstableType' @ [90:83] ==> val unstableType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'if (csBuilder.addSubtypeConstraintIfCompatible(argumentType, expectedNullableType, position)) {
            diagnosticsHolder.addDiagnostic(UnsafeCallError(expressionArgument))
        }
        else {
            csBuilder.addSubtypeConstraint(argumentType, expectedType, position)
        }' @ [92:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'csBuilder' @ [92:18] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [92:28] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'argumentType' @ [92:61] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedNullableType' @ [92:75] ==> val expectedNullableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'position' @ [92:97] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'diagnosticsHolder' @ [93:13] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addDiagnostic' @ [93:31] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'UnsafeCallError' @ [93:45] ==> public constructor UnsafeCallError(receiver: SimpleKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.UnsafeCallError[ClassConstructorDescriptorImpl]

'expressionArgument' @ [93:61] ==> value-parameter expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'csBuilder' @ [96:13] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [96:23] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'argumentType' @ [96:44] ==> val argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedType' @ [96:58] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[ValueParameterDescriptorImpl]

'position' @ [96:72] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'resolvedKtExpression' @ [100:12] ==> val resolvedKtExpression: ResolvedExpressionAtom defined in org.jetbrains.kotlin.resolve.calls.components.checkExpressionArgument[LocalVariableDescriptor]

'expectedType' @ [120:35] ==> value-parameter expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [120:48] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'constructor' @ [120:66] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'argumentType' @ [122:9] ==> value-parameter argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [122:22] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'constructor' @ [122:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [122:52] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'argumentType' @ [123:31] ==> value-parameter argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [123:44] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'supertypes' @ [123:62] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [123:75] ==> public inline fun <T> Iterable<KotlinType>.singleOrNull(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [124:13] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [124:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [124:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'it' @ [125:13] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [125:16] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'hasSupertypeWithGivenTypeConstructor' @ [125:25] ==> public fun UnwrappedType.hasSupertypeWithGivenTypeConstructor(typeConstructor: TypeConstructor): Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'expectedTypeConstructor' @ [125:62] ==> val expectedTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[LocalVariableDescriptor]

'chosenSupertype' @ [127:13] ==> val chosenSupertype: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[LocalVariableDescriptor]

'captureFromExpression' @ [128:20] ==> public fun captureFromExpression(type: UnwrappedType): UnwrappedType? defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'chosenSupertype' @ [128:42] ==> val chosenSupertype: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[LocalVariableDescriptor]

'unwrap' @ [128:58] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'argumentType' @ [128:71] ==> value-parameter argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[ValueParameterDescriptorImpl]

'argumentType' @ [132:12] ==> value-parameter argumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.captureFromTypeParameterUpperBoundIfNeeded[ValueParameterDescriptorImpl]

'subCallArgument' @ [142:25] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'callResult' @ [142:41] ==> public abstract val callResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'expectedType' @ [144:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'subCallResult' @ [144:38] ==> val subCallResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'expectedType' @ [146:32] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [146:45] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'if (isReceiver) ReceiverConstraintPosition(subCallArgument) else ArgumentConstraintPosition(subCallArgument)' @ [147:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintPosition, elseBranch: ConstraintPosition): ConstraintPosition[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintPosition

'isReceiver' @ [147:24] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'ReceiverConstraintPosition' @ [147:36] ==> public constructor ReceiverConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ReceiverConstraintPosition[ClassConstructorDescriptorImpl]

'subCallArgument' @ [147:63] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'ArgumentConstraintPosition' @ [147:85] ==> public constructor ArgumentConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[ClassConstructorDescriptorImpl]

'subCallArgument' @ [147:112] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'csBuilder' @ [151:29] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'buildCurrentSubstitutor' @ [151:39] ==> public abstract fun buildCurrentSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [151:65] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'subCallArgument' @ [151:80] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'receiver' @ [151:96] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'receiverValue' @ [151:105] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [151:119] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [151:124] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'subCallArgument' @ [152:9] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'isSafeCall' @ [152:25] ==> public abstract val isSafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.SubKotlinCallArgument[PropertyDescriptorImpl]

'csBuilder' @ [153:9] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [153:19] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'currentReturnType' @ [153:40] ==> val currentReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'expectedNullableType' @ [153:59] ==> val expectedNullableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'position' @ [153:81] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'subCallResult' @ [154:16] ==> val subCallResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'isReceiver' @ [157:9] ==> value-parameter isReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'!' @ [157:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'csBuilder' @ [157:24] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [157:34] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'currentReturnType' @ [157:67] ==> val currentReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'expectedType' @ [157:86] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'position' @ [157:100] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'csBuilder' @ [158:9] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraintIfCompatible' @ [158:19] ==> public fun ConstraintSystemBuilder.addSubtypeConstraintIfCompatible(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'currentReturnType' @ [158:52] ==> val currentReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'expectedNullableType' @ [158:71] ==> val expectedNullableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'position' @ [158:93] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'diagnosticsHolder' @ [160:9] ==> value-parameter diagnosticsHolder: KotlinDiagnosticsHolder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'addDiagnostic' @ [160:27] ==> public abstract fun addDiagnostic(diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder[SimpleFunctionDescriptorImpl]

'UnsafeCallError' @ [160:41] ==> public constructor UnsafeCallError(receiver: SimpleKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.UnsafeCallError[ClassConstructorDescriptorImpl]

'subCallArgument' @ [160:57] ==> value-parameter subCallArgument: SubKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'subCallResult' @ [161:16] ==> val subCallResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'csBuilder' @ [164:5] ==> value-parameter csBuilder: ConstraintSystemBuilder defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [164:15] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilder[SimpleFunctionDescriptorImpl]

'currentReturnType' @ [164:36] ==> val currentReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'expectedType' @ [164:55] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[ValueParameterDescriptorImpl]

'position' @ [164:69] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

'subCallResult' @ [165:12] ==> val subCallResult: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.checkSubCallArgument[LocalVariableDescriptor]

