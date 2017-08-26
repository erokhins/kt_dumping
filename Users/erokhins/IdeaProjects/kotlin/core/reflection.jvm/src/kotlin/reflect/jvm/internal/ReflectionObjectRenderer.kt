'DescriptorRenderer' @ [26:28] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [26:47] ==> @JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[PropertyDescriptorImpl]

'receiver' @ [29:13] ==> value-parameter receiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceiverType[ValueParameterDescriptorImpl]

'append' @ [30:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderType' @ [30:20] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'receiver' @ [30:31] ==> value-parameter receiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceiverType[ValueParameterDescriptorImpl]

'type' @ [30:40] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'append' @ [31:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'callable' @ [36:32] ==> value-parameter callable: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [36:41] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'callable' @ [37:33] ==> value-parameter callable: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [37:42] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'appendReceiverType' @ [39:9] ==> private final fun StringBuilder /* = StringBuilder */.appendReceiverType(receiver: ReceiverParameterDescriptor?): Unit defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [39:28] ==> val dispatchReceiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'dispatchReceiver' @ [41:30] ==> val dispatchReceiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'extensionReceiver' @ [41:58] ==> val extensionReceiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'addParentheses' @ [42:13] ==> val addParentheses: Boolean defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'append' @ [42:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendReceiverType' @ [43:9] ==> private final fun StringBuilder /* = StringBuilder */.appendReceiverType(receiver: ReceiverParameterDescriptor?): Unit defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'extensionReceiver' @ [43:28] ==> val extensionReceiver: ReceiverParameterDescriptor? defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'addParentheses' @ [44:13] ==> val addParentheses: Boolean defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.appendReceivers[LocalVariableDescriptor]

'append' @ [44:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when (descriptor) {
            is PropertyDescriptor -> renderProperty(descriptor)
            is FunctionDescriptor -> renderFunction(descriptor)
            else -> error("Illegal callable: $descriptor")
        }' @ [48:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [48:22] ==> value-parameter descriptor: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderCallable[ValueParameterDescriptorImpl]

'renderProperty' @ [49:38] ==> public final fun renderProperty(descriptor: PropertyDescriptor): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [49:53] ==> value-parameter descriptor: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderCallable[ValueParameterDescriptorImpl]

'renderFunction' @ [50:38] ==> public final fun renderFunction(descriptor: FunctionDescriptor): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:53] ==> value-parameter descriptor: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderCallable[ValueParameterDescriptorImpl]

'error' @ [51:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [51:47] ==> value-parameter descriptor: CallableDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderCallable[ValueParameterDescriptorImpl]

'buildString' @ [57:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [58:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (descriptor.isVar) "var " else "val "' @ [58:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [58:24] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderProperty[ValueParameterDescriptorImpl]

'isVar' @ [58:35] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'appendReceivers' @ [59:13] ==> private final fun StringBuilder /* = StringBuilder */.appendReceivers(callable: CallableDescriptor): Unit defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [59:29] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderProperty[ValueParameterDescriptorImpl]

'append' @ [60:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderer' @ [60:20] ==> private final val renderer: DescriptorRenderer defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[PropertyDescriptorImpl]

'renderName' @ [60:29] ==> public abstract fun renderName(name: Name): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [60:40] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderProperty[ValueParameterDescriptorImpl]

'name' @ [60:51] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'append' @ [62:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [63:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderType' @ [63:20] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [63:31] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderProperty[ValueParameterDescriptorImpl]

'type' @ [63:42] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'buildString' @ [68:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [69:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendReceivers' @ [70:13] ==> private final fun StringBuilder /* = StringBuilder */.appendReceivers(callable: CallableDescriptor): Unit defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [70:29] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction[ValueParameterDescriptorImpl]

'append' @ [71:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderer' @ [71:20] ==> private final val renderer: DescriptorRenderer defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[PropertyDescriptorImpl]

'renderName' @ [71:29] ==> public abstract fun renderName(name: Name): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [71:40] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction[ValueParameterDescriptorImpl]

'name' @ [71:51] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [73:13] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [73:24] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinTo' @ [73:40] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [73:47] ==> <this> defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction.<anonymous>[ReceiverParameterDescriptorImpl]

'renderType' @ [74:17] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'it' @ [74:28] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [74:31] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'append' @ [77:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [78:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderType' @ [78:20] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [78:31] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderFunction[ValueParameterDescriptorImpl]

'returnType' @ [78:42] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'buildString' @ [83:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendReceivers' @ [84:13] ==> private final fun StringBuilder /* = StringBuilder */.appendReceivers(callable: CallableDescriptor): Unit defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'invoke' @ [84:29] ==> value-parameter invoke: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderLambda[ValueParameterDescriptorImpl]

'invoke' @ [86:13] ==> value-parameter invoke: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderLambda[ValueParameterDescriptorImpl]

'valueParameters' @ [86:20] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinTo' @ [86:36] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [86:43] ==> <this> defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderLambda.<anonymous>[ReceiverParameterDescriptorImpl]

'renderType' @ [87:17] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'it' @ [87:28] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderLambda.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [87:31] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'append' @ [90:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [91:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderType' @ [91:20] ==> public final fun renderType(type: KotlinType): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'invoke' @ [91:31] ==> value-parameter invoke: FunctionDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderLambda[ValueParameterDescriptorImpl]

'returnType' @ [91:38] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'buildString' @ [96:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (parameter.kind) {
                KParameter.Kind.EXTENSION_RECEIVER -> append("extension receiver")
                KParameter.Kind.INSTANCE -> append("instance")
                KParameter.Kind.VALUE -> append("parameter #${parameter.index} ${parameter.name}")
            }' @ [97:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'parameter' @ [97:19] ==> value-parameter parameter: KParameterImpl defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderParameter[ValueParameterDescriptorImpl]

'kind' @ [97:29] ==> public open val kind: KParameter.Kind defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'EXTENSION_RECEIVER' @ [98:33] ==> enum entry EXTENSION_RECEIVER defined in kotlin.reflect.KParameter.Kind[FakeCallableDescriptorForObject]

'append' @ [98:55] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'INSTANCE' @ [99:33] ==> enum entry INSTANCE defined in kotlin.reflect.KParameter.Kind[FakeCallableDescriptorForObject]

'append' @ [99:45] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'VALUE' @ [100:33] ==> enum entry VALUE defined in kotlin.reflect.KParameter.Kind[FakeCallableDescriptorForObject]

'append' @ [100:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameter' @ [100:63] ==> value-parameter parameter: KParameterImpl defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderParameter[ValueParameterDescriptorImpl]

'index' @ [100:73] ==> public open val index: Int defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'parameter' @ [100:82] ==> value-parameter parameter: KParameterImpl defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderParameter[ValueParameterDescriptorImpl]

'name' @ [100:92] ==> public open val name: String? defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'append' @ [103:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [104:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderCallable' @ [104:20] ==> public final fun renderCallable(descriptor: CallableDescriptor): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'parameter' @ [104:35] ==> value-parameter parameter: KParameterImpl defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderParameter[ValueParameterDescriptorImpl]

'callable' @ [104:45] ==> public final val callable: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'descriptor' @ [104:54] ==> public abstract val descriptor: CallableMemberDescriptor defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'buildString' @ [109:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (typeParameter.variance) {
                Variance.INVARIANT -> {}
                Variance.IN_VARIANCE -> append("in ")
                Variance.OUT_VARIANCE -> append("out ")
            }' @ [110:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'typeParameter' @ [110:19] ==> value-parameter typeParameter: TypeParameterDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderTypeParameter[ValueParameterDescriptorImpl]

'variance' @ [110:33] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [111:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [112:26] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'append' @ [112:41] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'OUT_VARIANCE' @ [113:26] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'append' @ [113:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [116:13] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'typeParameter' @ [116:20] ==> value-parameter typeParameter: TypeParameterDescriptor defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderTypeParameter[ValueParameterDescriptorImpl]

'name' @ [116:34] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'renderer' @ [121:16] ==> private final val renderer: DescriptorRenderer defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[PropertyDescriptorImpl]

'renderType' @ [121:25] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'type' @ [121:36] ==> value-parameter type: KotlinType defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer.renderType[ValueParameterDescriptorImpl]

