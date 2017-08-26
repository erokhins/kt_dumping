'when (this) {
        MATCH -> body(true)
        NO_MATCH -> body(false)
        UNSURE -> Unit
    }' @ [24:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [24:56] ==> <this> defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[LazyClassReceiverParameterDescriptor]

'MATCH' @ [25:9] ==> enum entry MATCH defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[FakeCallableDescriptorForObject]

'invoke' @ [25:18] ==> public abstract operator fun invoke(p1: Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'NO_MATCH' @ [26:9] ==> enum entry NO_MATCH defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[FakeCallableDescriptorForObject]

'invoke' @ [26:21] ==> public abstract operator fun invoke(p1: Boolean): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'UNSURE' @ [27:9] ==> enum entry UNSURE defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[FakeCallableDescriptorForObject]

'Unit' @ [27:19] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

