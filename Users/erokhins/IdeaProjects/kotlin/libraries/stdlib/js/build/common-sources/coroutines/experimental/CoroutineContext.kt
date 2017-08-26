'SinceKotlin' @ [24:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'if (context === EmptyCoroutineContext) this else // fast path -- avoid lambda creation
                context.fold(this) { acc, element ->
                    val removed = acc.minusKey(element.key)
                    if (removed === EmptyCoroutineContext) element else {
                        // make sure interceptor is always last in the context (and thus is fast to get when present)
                        val interceptor = removed[ContinuationInterceptor]
                        if (interceptor == null) CombinedContext(removed, element) else {
                            val left = removed.minusKey(ContinuationInterceptor)
                            if (left === EmptyCoroutineContext) CombinedContext(element, interceptor) else
                                CombinedContext(CombinedContext(left, element), interceptor)
                        }
                    }
                }' @ [44:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoroutineContext, elseBranch: CoroutineContext): CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoroutineContext

'context' @ [44:17] ==> value-parameter context: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus[ValueParameterDescriptorImpl]

'EmptyCoroutineContext' @ [44:29] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

'this' @ [44:52] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext[LazyClassReceiverParameterDescriptor]

'context' @ [45:17] ==> value-parameter context: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus[ValueParameterDescriptorImpl]

'fold' @ [45:25] ==> public abstract fun <R> fold(initial: CoroutineContext, operation: (CoroutineContext, CoroutineContext.Element) -> CoroutineContext): CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> CoroutineContext

'this' @ [45:30] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext[LazyClassReceiverParameterDescriptor]

'acc' @ [46:35] ==> value-parameter acc: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'minusKey' @ [46:39] ==> public abstract fun minusKey(key: CoroutineContext.Key<*>): CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext[SimpleFunctionDescriptorImpl]

'element' @ [46:48] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [46:56] ==> public abstract val key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CoroutineContext.Element[PropertyDescriptorImpl]

'if (removed === EmptyCoroutineContext) element else {
                        // make sure interceptor is always last in the context (and thus is fast to get when present)
                        val interceptor = removed[ContinuationInterceptor]
                        if (interceptor == null) CombinedContext(removed, element) else {
                            val left = removed.minusKey(ContinuationInterceptor)
                            if (left === EmptyCoroutineContext) CombinedContext(element, interceptor) else
                                CombinedContext(CombinedContext(left, element), interceptor)
                        }
                    }' @ [47:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoroutineContext, elseBranch: CoroutineContext): CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoroutineContext

'removed' @ [47:25] ==> val removed: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'EmptyCoroutineContext' @ [47:37] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

'element' @ [47:60] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [49:43] ==> val removed: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'ContinuationInterceptor' @ [49:51] ==> public companion object Key : CoroutineContext.Key<ContinuationInterceptor> defined in kotlin.coroutines.experimental.ContinuationInterceptor[FakeCallableDescriptorForObject]

'if (interceptor == null) CombinedContext(removed, element) else {
                            val left = removed.minusKey(ContinuationInterceptor)
                            if (left === EmptyCoroutineContext) CombinedContext(element, interceptor) else
                                CombinedContext(CombinedContext(left, element), interceptor)
                        }' @ [50:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CombinedContext, elseBranch: CombinedContext): CombinedContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CombinedContext

'interceptor' @ [50:29] ==> val interceptor: ContinuationInterceptor? defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'CombinedContext' @ [50:50] ==> public constructor CombinedContext(left: CoroutineContext, element: CoroutineContext.Element) defined in kotlin.coroutines.experimental.CombinedContext[ClassConstructorDescriptorImpl]

'removed' @ [50:66] ==> val removed: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'element' @ [50:75] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [51:40] ==> val removed: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'minusKey' @ [51:48] ==> public abstract fun minusKey(key: CoroutineContext.Key<*>): CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext[SimpleFunctionDescriptorImpl]

'ContinuationInterceptor' @ [51:57] ==> public companion object Key : CoroutineContext.Key<ContinuationInterceptor> defined in kotlin.coroutines.experimental.ContinuationInterceptor[FakeCallableDescriptorForObject]

'if (left === EmptyCoroutineContext) CombinedContext(element, interceptor) else
                                CombinedContext(CombinedContext(left, element), interceptor)' @ [52:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CombinedContext, elseBranch: CombinedContext): CombinedContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CombinedContext

'left' @ [52:33] ==> val left: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'EmptyCoroutineContext' @ [52:42] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

'CombinedContext' @ [52:65] ==> public constructor CombinedContext(left: CoroutineContext, element: CoroutineContext.Element) defined in kotlin.coroutines.experimental.CombinedContext[ClassConstructorDescriptorImpl]

'element' @ [52:81] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'interceptor' @ [52:90] ==> val interceptor: ContinuationInterceptor? defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'CombinedContext' @ [53:33] ==> public constructor CombinedContext(left: CoroutineContext, element: CoroutineContext.Element) defined in kotlin.coroutines.experimental.CombinedContext[ClassConstructorDescriptorImpl]

'CombinedContext' @ [53:49] ==> public constructor CombinedContext(left: CoroutineContext, element: CoroutineContext.Element) defined in kotlin.coroutines.experimental.CombinedContext[ClassConstructorDescriptorImpl]

'left' @ [53:65] ==> val left: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'element' @ [53:71] ==> value-parameter element: CoroutineContext.Element defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[ValueParameterDescriptorImpl]

'interceptor' @ [53:81] ==> val interceptor: ContinuationInterceptor? defined in kotlin.coroutines.experimental.CoroutineContext.plus.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [74:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (this.key === key) this as E else null' @ [76:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: E?, elseBranch: E?): E?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> E?

'this' @ [76:21] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext.Element[LazyClassReceiverParameterDescriptor]

'key' @ [76:26] ==> public abstract val key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CoroutineContext.Element[PropertyDescriptorImpl]

'key' @ [76:34] ==> value-parameter key: CoroutineContext.Key<E> defined in kotlin.coroutines.experimental.CoroutineContext.Element.get[ValueParameterDescriptorImpl]

'this' @ [76:39] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext.Element[LazyClassReceiverParameterDescriptor]

'invoke' @ [79:17] ==> public abstract operator fun invoke(p1: R, p2: CoroutineContext.Element): R defined in kotlin.Function2[FunctionInvokeDescriptor]

'initial' @ [79:27] ==> value-parameter initial: R defined in kotlin.coroutines.experimental.CoroutineContext.Element.fold[ValueParameterDescriptorImpl]

'this' @ [79:36] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext.Element[LazyClassReceiverParameterDescriptor]

'if (this.key === key) EmptyCoroutineContext else this' @ [82:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoroutineContext, elseBranch: CoroutineContext): CoroutineContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoroutineContext

'this' @ [82:21] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext.Element[LazyClassReceiverParameterDescriptor]

'key' @ [82:26] ==> public abstract val key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CoroutineContext.Element[PropertyDescriptorImpl]

'key' @ [82:34] ==> value-parameter key: CoroutineContext.Key<*> defined in kotlin.coroutines.experimental.CoroutineContext.Element.minusKey[ValueParameterDescriptorImpl]

'EmptyCoroutineContext' @ [82:39] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

'this' @ [82:66] ==> <this> defined in kotlin.coroutines.experimental.CoroutineContext.Element[LazyClassReceiverParameterDescriptor]

