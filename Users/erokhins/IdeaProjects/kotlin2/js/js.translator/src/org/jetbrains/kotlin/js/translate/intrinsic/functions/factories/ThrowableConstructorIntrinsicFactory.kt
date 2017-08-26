'descriptor' @ [34:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.getIntrinsic[ValueParameterDescriptorImpl]

'!' @ [35:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [35:14] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.getIntrinsic[ValueParameterDescriptorImpl]

'constructedClass' @ [35:25] ==> public final val ConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'defaultType' @ [35:42] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'isNotNullThrowable' @ [35:54] ==> public fun KotlinType.isNotNullThrowable(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'Intrinsic' @ [37:16] ==> public object Intrinsic : FunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory[FakeCallableDescriptorForObject]

'FunctionIntrinsic' @ [40:24] ==> public constructor FunctionIntrinsic() defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.basic.FunctionIntrinsic[ClassConstructorDescriptorImpl]

'callInfo' @ [42:31] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[ValueParameterDescriptorImpl]

'resolvedCall' @ [42:40] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [42:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'arguments' @ [43:35] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[ValueParameterDescriptorImpl]

'toMutableList' @ [43:45] ==> public fun <T> Collection<JsExpression>.toMutableList(): MutableList<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'constructor' @ [44:37] ==> val constructor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[LocalVariableDescriptor]

'valueParameters' @ [44:49] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [44:65] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [45:17] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [45:20] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [45:25] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [45:37] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [45:60] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'FQ_NAMES' @ [45:89] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'throwable' @ [45:98] ==> public final val throwable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'constructor' @ [48:17] ==> val constructor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[LocalVariableDescriptor]

'valueParameters' @ [48:29] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [48:45] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'hasCauseParameter' @ [48:58] ==> val hasCauseParameter: Boolean defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[LocalVariableDescriptor]

'argumentsToPass' @ [49:17] ==> val argumentsToPass: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[LocalVariableDescriptor]

'add' @ [49:33] ==> public abstract fun add(index: Int, element: JsExpression): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getUndefinedExpression' @ [49:46] ==> @NotNull public open fun getUndefinedExpression(): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'JsInvocation' @ [52:20] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [52:44] ==> @NotNull public open fun pureFqn(@NotNull identifier: String, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'kotlinObject' @ [52:74] ==> @NotNull public open fun kotlinObject(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'argumentsToPass' @ [52:91] ==> val argumentsToPass: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ThrowableConstructorIntrinsicFactory.Intrinsic.apply[LocalVariableDescriptor]

