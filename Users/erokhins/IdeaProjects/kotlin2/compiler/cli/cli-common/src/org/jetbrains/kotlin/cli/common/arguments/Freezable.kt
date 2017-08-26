'value' @ [24:71] ==> private final var value: T defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.FreezableVar[PropertyDescriptorImpl]

'frozen' @ [27:17] ==> private final var frozen: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[PropertyDescriptorImpl]

'IllegalStateException' @ [27:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [27:68] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.FreezableVar[LazyClassReceiverParameterDescriptor]

'this' @ [28:13] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.FreezableVar[LazyClassReceiverParameterDescriptor]

'value' @ [28:18] ==> private final var value: T defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.FreezableVar[PropertyDescriptorImpl]

'value' @ [28:26] ==> value-parameter value: T defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.FreezableVar.setValue[ValueParameterDescriptorImpl]

'if (value == frozen) this else copyBean(this).apply { frozen = value }' @ [34:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Freezable, elseBranch: Freezable): Freezable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Freezable

'value' @ [34:67] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.getInstanceWithFreezeStatus[ValueParameterDescriptorImpl]

'frozen' @ [34:76] ==> private final var frozen: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[PropertyDescriptorImpl]

'this' @ [34:84] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[LazyClassReceiverParameterDescriptor]

'copyBean' @ [34:94] ==> @Suppress public fun <T : Any> copyBean(bean: Freezable): Freezable defined in org.jetbrains.kotlin.cli.common.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Freezable

'this' @ [34:103] ==> <this> defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[LazyClassReceiverParameterDescriptor]

'apply' @ [34:109] ==> @InlineOnly public inline fun <T> Freezable.apply(block: Freezable.() -> Unit): Freezable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Freezable

'frozen' @ [34:117] ==> private final var frozen: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[PropertyDescriptorImpl]

'value' @ [34:126] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.Freezable.getInstanceWithFreezeStatus[ValueParameterDescriptorImpl]

'getInstanceWithFreezeStatus' @ [36:20] ==> private final fun getInstanceWithFreezeStatus(value: Boolean): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[SimpleFunctionDescriptorImpl]

'getInstanceWithFreezeStatus' @ [37:22] ==> private final fun getInstanceWithFreezeStatus(value: Boolean): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.Freezable[SimpleFunctionDescriptorImpl]

