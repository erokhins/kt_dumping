'irElement' @ [25:20] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.reportWarning[ValueParameterDescriptorImpl]

'getCompilerMessageLocation' @ [25:30] ==> public fun IrElement.getCompilerMessageLocation(containingFile: IrFile): CompilerMessageLocation? defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'irFile' @ [25:57] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.common.reportWarning[ValueParameterDescriptorImpl]

'messageCollector' @ [26:5] ==> public abstract val messageCollector: MessageCollector defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'report' @ [26:22] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'WARNING' @ [26:53] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [26:62] ==> value-parameter message: String defined in org.jetbrains.kotlin.backend.common.reportWarning[ValueParameterDescriptorImpl]

'location' @ [26:71] ==> val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.backend.common.reportWarning[LocalVariableDescriptor]

'this' @ [29:43] ==> <this> defined in org.jetbrains.kotlin.backend.common.push[ReceiverParameterDescriptorImpl]

'add' @ [29:48] ==> public abstract fun add(element: E): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [29:52] ==> value-parameter element: E defined in org.jetbrains.kotlin.backend.common.push[ValueParameterDescriptorImpl]

'this' @ [31:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.pop[ReceiverParameterDescriptorImpl]

'removeAt' @ [31:37] ==> public abstract fun removeAt(index: Int): E defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'size' @ [31:46] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'if (size == 0) null else this[size - 1]' @ [33:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: E?, elseBranch: E?): E?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> E?

'size' @ [33:41] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'this' @ [33:62] ==> <this> defined in org.jetbrains.kotlin.backend.common.peek[ReceiverParameterDescriptorImpl]

'size' @ [33:67] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'when (this.size) {
        0 -> null
        1 -> this.iterator().next()
        else -> throw IllegalArgumentException("Collection has more than one element.")
    }' @ [36:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: T?, entry1: T?, entry2: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> T?

'this' @ [36:18] ==> <this> defined in org.jetbrains.kotlin.backend.common.atMostOne[ReceiverParameterDescriptorImpl]

'size' @ [36:23] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'this' @ [38:14] ==> <this> defined in org.jetbrains.kotlin.backend.common.atMostOne[ReceiverParameterDescriptorImpl]

'iterator' @ [38:19] ==> public abstract fun iterator(): Iterator<T> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'next' @ [38:30] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [39:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [43:71] ==> <this> defined in org.jetbrains.kotlin.backend.common.atMostOne[ReceiverParameterDescriptorImpl]

'filter' @ [43:76] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [43:83] ==> value-parameter predicate: (T) -> Boolean defined in org.jetbrains.kotlin.backend.common.atMostOne[ValueParameterDescriptorImpl]

'atMostOne' @ [43:94] ==> public fun <T> Collection<T>.atMostOne(): T? defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.onlyIf[ReceiverParameterDescriptorImpl]

'invoke' @ [46:14] ==> public abstract operator fun T.invoke(): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [46:27] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [46:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.onlyIf[ReceiverParameterDescriptorImpl]

'this' @ [47:12] ==> <this> defined in org.jetbrains.kotlin.backend.common.onlyIf[ReceiverParameterDescriptorImpl]

