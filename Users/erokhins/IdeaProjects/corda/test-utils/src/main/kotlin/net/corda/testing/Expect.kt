'getLogger' @ [36:41] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'Single' @ [46:26] ==> public constructor Single<out E, T : E>(expect: Expect<E, E>) defined in net.corda.testing.ExpectCompose.Single[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E
    <T : E> -> E

'Expect' @ [46:33] ==> public constructor Expect<out E, T : E>(clazz: Class<E>, match: (E) -> Boolean, expectClosure: (E) -> Unit) defined in net.corda.testing.Expect[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E
    <T : E> -> E

'klass' @ [46:40] ==> value-parameter klass: Class<E> defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'match' @ [46:47] ==> value-parameter match: (E) -> Boolean defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'expectClosure' @ [46:54] ==> value-parameter expectClosure: (E) -> Unit defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'expect' @ [55:23] ==> public fun <E : Any> expect(klass: Class<E>, match: (E) -> Boolean, expectClosure: (E) -> Unit): ExpectCompose<E> defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : Any> -> E

'java' @ [55:39] ==> public val <T> KClass<E>.java: Class<E> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> E

'match' @ [55:45] ==> value-parameter noinline match: (E) -> Boolean = ... defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'expectClosure' @ [55:52] ==> value-parameter noinline expectClosure: (E) -> Unit defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'expect' @ [63:23] ==> public inline fun <reified E : Any> expect(noinline match: (E) -> Boolean = ..., noinline expectClosure: (E) -> Unit): ExpectCompose<E> defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : Any> -> E

'event' @ [63:40] ==> value-parameter event: E defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'it' @ [63:49] ==> value-parameter it: E defined in net.corda.testing.expect.<anonymous>[ValueParameterDescriptorImpl]

'expectClosure' @ [63:71] ==> value-parameter noinline expectClosure: (E) -> Unit = ... defined in net.corda.testing.expect[ValueParameterDescriptorImpl]

'Sequential' @ [70:91] ==> public constructor Sequential<out E>(sequence: List<ExpectCompose<E>>) defined in net.corda.testing.ExpectCompose.Sequential[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'listOf' @ [70:102] ==> public fun <T> listOf(vararg elements: ExpectCompose<E>): List<ExpectCompose<E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectCompose<E>

'expectations' @ [70:110] ==> value-parameter vararg expectations: ExpectCompose<E> defined in net.corda.testing.sequence[ValueParameterDescriptorImpl]

'Sequential' @ [72:90] ==> public constructor Sequential<out E>(sequence: List<ExpectCompose<E>>) defined in net.corda.testing.ExpectCompose.Sequential[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'expectations' @ [72:101] ==> value-parameter expectations: List<ExpectCompose<E>> defined in net.corda.testing.sequence[ValueParameterDescriptorImpl]

'Parallel' @ [79:91] ==> public constructor Parallel<out E>(parallel: List<ExpectCompose<E>>) defined in net.corda.testing.ExpectCompose.Parallel[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'listOf' @ [79:100] ==> public fun <T> listOf(vararg elements: ExpectCompose<E>): List<ExpectCompose<E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectCompose<E>

'expectations' @ [79:108] ==> value-parameter vararg expectations: ExpectCompose<E> defined in net.corda.testing.parallel[ValueParameterDescriptorImpl]

'Parallel' @ [86:90] ==> public constructor Parallel<out E>(parallel: List<ExpectCompose<E>>) defined in net.corda.testing.ExpectCompose.Parallel[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'expectations' @ [86:99] ==> value-parameter expectations: List<ExpectCompose<E>> defined in net.corda.testing.parallel[ValueParameterDescriptorImpl]

'sequence' @ [95:9] ==> public fun <E> sequence(vararg expectations: ExpectCompose<E>): ExpectCompose<E> defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> E

'Array' @ [95:19] ==> public constructor Array<T>(size: Int, init: (Int) -> ExpectCompose<E>) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ExpectCompose<E>

'number' @ [95:25] ==> value-parameter number: Int defined in net.corda.testing.replicate[ValueParameterDescriptorImpl]

'invoke' @ [95:35] ==> public abstract operator fun invoke(p1: Int): ExpectCompose<E> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [95:47] ==> value-parameter it: Int defined in net.corda.testing.replicate.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [104:9] ==> public final fun serialize(): (Observable<(E..E?)>..Observable<(E..E?)>?) defined in rx.Observable[JavaMethodDescriptor]

'genericExpectEvents' @ [104:21] ==> public fun <S, E : Any> (Observable<(E..E?)>..Observable<(E..E?)>?).genericExpectEvents(isStrict: Boolean = ..., stream: (Observable<(E..E?)>..Observable<(E..E?)>?).((E) -> Unit) -> Unit, expectCompose: () -> ExpectCompose<E>): Unit defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> (rx.Observable<(E..E?)>..rx.Observable<(E..E?)>?)
    <E : Any> -> E

'isStrict' @ [105:28] ==> value-parameter isStrict: Boolean = ... defined in net.corda.testing.expectEvents[ValueParameterDescriptorImpl]

'subscribe' @ [108:21] ==> public final fun subscribe(p0: (((E..E?)) -> Unit..(((E..E?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'synchronized' @ [109:25] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'lock' @ [109:38] ==> val lock: <no name provided><E> defined in net.corda.testing.expectEvents.<anonymous>[LocalVariableDescriptor]

'invoke' @ [110:29] ==> public abstract operator fun invoke(p1: E): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'event' @ [110:36] ==> value-parameter event: (E..E?) defined in net.corda.testing.expectEvents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expectCompose' @ [114:33] ==> value-parameter expectCompose: () -> ExpectCompose<E> defined in net.corda.testing.expectEvents[ValueParameterDescriptorImpl]

'genericExpectEvents' @ [124:9] ==> public fun <S, E : Any> Iterable<E>.genericExpectEvents(isStrict: Boolean = ..., stream: Iterable<E>.((E) -> Unit) -> Unit, expectCompose: () -> ExpectCompose<E>): Unit defined in net.corda.testing[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> Iterable<E>
    <E : Any> -> E

'isStrict' @ [125:28] ==> value-parameter isStrict: Boolean = ... defined in net.corda.testing.expectEvents[ValueParameterDescriptorImpl]

'forEach' @ [127:21] ==> @HidesMembers public inline fun <T> Iterable<E>.forEach(action: (E) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E

'action' @ [127:29] ==> value-parameter action: (E) -> Unit defined in net.corda.testing.expectEvents.<anonymous>[ValueParameterDescriptorImpl]

'expectCompose' @ [129:33] ==> value-parameter expectCompose: () -> ExpectCompose<E> defined in net.corda.testing.expectEvents[ValueParameterDescriptorImpl]

'create' @ [144:39] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Unit

'ExpectComposeState' @ [155:17] ==> public companion object defined in net.corda.testing.ExpectComposeState[FakeCallableDescriptorForObject]

'fromExpectCompose' @ [155:36] ==> public final fun <E : Any> fromExpectCompose(expectCompose: ExpectCompose<E>): ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : Any> -> E

'invoke' @ [155:54] ==> public abstract operator fun invoke(): ExpectCompose<E> defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [156:5] ==> public abstract operator fun S.invoke(p2: (E) -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'state' @ [157:13] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'isStrict' @ [158:17] ==> value-parameter isStrict: Boolean = ... defined in net.corda.testing.genericExpectEvents[ValueParameterDescriptorImpl]

'log' @ [159:17] ==> private val log: Logger defined in net.corda.testing in file Expect.kt[PropertyDescriptorImpl]

'warn' @ [159:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'event' @ [159:38] ==> value-parameter event: E defined in net.corda.testing.genericExpectEvents.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [163:20] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'nextState' @ [163:26] ==> public abstract fun nextState(event: E): Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'event' @ [163:36] ==> value-parameter event: E defined in net.corda.testing.genericExpectEvents.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [164:30] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'getExpectedEvents' @ [164:36] ==> public abstract fun getExpectedEvents(): List<Class<out E>> defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'log' @ [165:9] ==> private val log: Logger defined in net.corda.testing in file Expect.kt[PropertyDescriptorImpl]

'info' @ [165:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'event' @ [165:20] ==> value-parameter event: E defined in net.corda.testing.genericExpectEvents.<anonymous>[ValueParameterDescriptorImpl]

'expectedStates' @ [165:31] ==> val expectedStates: List<Class<out E>> defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'map' @ [165:46] ==> public inline fun <T, R> Iterable<Class<out E>>.map(transform: (Class<out E>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out E>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [165:52] ==> value-parameter it: Class<out E> defined in net.corda.testing.genericExpectEvents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [165:55] ==> public final val <T : (Any..Any?)> Class<out E>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out E)

'next' @ [165:74] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'second' @ [165:80] ==> public final val second: ExpectComposeState<E> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'getExpectedEvents' @ [165:88] ==> public abstract fun getExpectedEvents(): List<Class<out E>> defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'map' @ [165:109] ==> public inline fun <T, R> Iterable<Class<out E>>.map(transform: (Class<out E>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out E>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [165:115] ==> value-parameter it: Class<out E> defined in net.corda.testing.genericExpectEvents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [165:118] ==> public final val <T : (Any..Any?)> Class<out E>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out E)

'if (next == null) {
            val message = "Got $event, did not match any expectations of type ${expectedStates.map { it.simpleName }}"
            if (isStrict) {
                finishFuture.setException(Exception(message))
                state = ExpectComposeState.Finished()
            } else {
                log.info("$message, discarding event as isStrict=false")
            }
        } else {
            state = next.second
            val expectClosure = next.first
            // Now run the matching piece of dsl
            try {
                expectClosure()
            } catch (exception: Exception) {
                finishFuture.setException(exception)
            }
            if (state is ExpectComposeState.Finished) {
                finishFuture.set(Unit)
            }
        }' @ [166:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [166:13] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'event' @ [167:33] ==> value-parameter event: E defined in net.corda.testing.genericExpectEvents.<anonymous>[ValueParameterDescriptorImpl]

'expectedStates' @ [167:81] ==> val expectedStates: List<Class<out E>> defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'map' @ [167:96] ==> public inline fun <T, R> Iterable<Class<out E>>.map(transform: (Class<out E>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out E>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [167:102] ==> value-parameter it: Class<out E> defined in net.corda.testing.genericExpectEvents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [167:105] ==> public final val <T : (Any..Any?)> Class<out E>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out E)

'if (isStrict) {
                finishFuture.setException(Exception(message))
                state = ExpectComposeState.Finished()
            } else {
                log.info("$message, discarding event as isStrict=false")
            }' @ [168:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isStrict' @ [168:17] ==> value-parameter isStrict: Boolean = ... defined in net.corda.testing.genericExpectEvents[ValueParameterDescriptorImpl]

'finishFuture' @ [169:17] ==> val finishFuture: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'setException' @ [169:30] ==> @CanIgnoreReturnValue public open fun setException(p0: (Throwable..Throwable?)): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'Exception' @ [169:43] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'message' @ [169:53] ==> val message: String defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'state' @ [170:17] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'ExpectComposeState' @ [170:25] ==> public companion object defined in net.corda.testing.ExpectComposeState[FakeCallableDescriptorForObject]

'Finished' @ [170:44] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'log' @ [172:17] ==> private val log: Logger defined in net.corda.testing in file Expect.kt[PropertyDescriptorImpl]

'info' @ [172:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'message' @ [172:28] ==> val message: String defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'state' @ [175:13] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'next' @ [175:21] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'second' @ [175:26] ==> public final val second: ExpectComposeState<E> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'next' @ [176:33] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'first' @ [176:38] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'invoke' @ [179:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'finishFuture' @ [181:17] ==> val finishFuture: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'setException' @ [181:30] ==> @CanIgnoreReturnValue public open fun setException(p0: (Throwable..Throwable?)): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'exception' @ [181:43] ==> val exception: Exception /* = Exception */ defined in net.corda.testing.genericExpectEvents.<anonymous>[LocalVariableDescriptor]

'state' @ [183:17] ==> var state: ExpectComposeState<E> defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'finishFuture' @ [184:17] ==> val finishFuture: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'set' @ [184:30] ==> @CanIgnoreReturnValue public open fun set(@Nullable p0: Unit?): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'Unit' @ [184:34] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'finishFuture' @ [188:5] ==> val finishFuture: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.genericExpectEvents[LocalVariableDescriptor]

'getOrThrow' @ [188:18] ==> public fun <V> Future<(Unit..Unit?)>.getOrThrow(timeout: Duration? = ...): (Unit..Unit?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.Unit..kotlin.Unit?)

'ExpectCompose<E>' @ [192:69] ==> private constructor ExpectCompose<out E>() defined in net.corda.testing.ExpectCompose[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'ExpectCompose<E>' @ [193:78] ==> private constructor ExpectCompose<out E>() defined in net.corda.testing.ExpectCompose[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'ExpectCompose<E>' @ [194:76] ==> private constructor ExpectCompose<out E>() defined in net.corda.testing.ExpectCompose[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> E

'ExpectComposeState<E>' @ [208:31] ==> private constructor ExpectComposeState<E : Any>() defined in net.corda.testing.ExpectComposeState[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'listOf' @ [210:60] ==> @InlineOnly public inline fun <T> listOf(): List<Class<E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<E>

'ExpectComposeState<E>' @ [213:76] ==> private constructor ExpectComposeState<E : Any>() defined in net.corda.testing.ExpectComposeState[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'if (single.expect.clazz.isAssignableFrom(event.javaClass)) {
                    @Suppress("UNCHECKED_CAST")
                    val coercedEvent = event as T
                    if (single.expect.match(event)) {
                        Pair({ single.expect.expectClosure(coercedEvent) }, Finished())
                    } else {
                        null
                    }
                } else {
                    null
                }' @ [215:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>?, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>?): Pair<() -> Unit, ExpectComposeState<E>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>?

'single' @ [215:21] ==> public final val single: ExpectCompose.Single<E, T> defined in net.corda.testing.ExpectComposeState.Single[PropertyDescriptorImpl]

'expect' @ [215:28] ==> public final val expect: Expect<E, T> defined in net.corda.testing.ExpectCompose.Single[PropertyDescriptorImpl]

'clazz' @ [215:35] ==> public final val clazz: Class<T> defined in net.corda.testing.Expect[PropertyDescriptorImpl]

'isAssignableFrom' @ [215:41] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'event' @ [215:58] ==> value-parameter event: E defined in net.corda.testing.ExpectComposeState.Single.nextState[ValueParameterDescriptorImpl]

'javaClass' @ [215:64] ==> public val <T : Any> E.javaClass: Class<E> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> E

'Suppress' @ [216:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'event' @ [217:40] ==> value-parameter event: E defined in net.corda.testing.ExpectComposeState.Single.nextState[ValueParameterDescriptorImpl]

'if (single.expect.match(event)) {
                        Pair({ single.expect.expectClosure(coercedEvent) }, Finished())
                    } else {
                        null
                    }' @ [218:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>?, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>?): Pair<() -> Unit, ExpectComposeState<E>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>?

'single' @ [218:25] ==> public final val single: ExpectCompose.Single<E, T> defined in net.corda.testing.ExpectComposeState.Single[PropertyDescriptorImpl]

'expect' @ [218:32] ==> public final val expect: Expect<E, T> defined in net.corda.testing.ExpectCompose.Single[PropertyDescriptorImpl]

'invoke' @ [218:39] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'event' @ [218:45] ==> value-parameter event: E defined in net.corda.testing.ExpectComposeState.Single.nextState[ValueParameterDescriptorImpl]

'Pair' @ [219:25] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> ExpectComposeState<E>

'single' @ [219:32] ==> public final val single: ExpectCompose.Single<E, T> defined in net.corda.testing.ExpectComposeState.Single[PropertyDescriptorImpl]

'expect' @ [219:39] ==> public final val expect: Expect<E, T> defined in net.corda.testing.ExpectCompose.Single[PropertyDescriptorImpl]

'invoke' @ [219:46] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'coercedEvent' @ [219:60] ==> val coercedEvent: T defined in net.corda.testing.ExpectComposeState.Single.nextState[LocalVariableDescriptor]

'Finished' @ [219:77] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'listOf' @ [227:44] ==> public fun <T> listOf(element: Class<T>): List<Class<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<T>

'single' @ [227:51] ==> public final val single: ExpectCompose.Single<E, T> defined in net.corda.testing.ExpectComposeState.Single[PropertyDescriptorImpl]

'expect' @ [227:58] ==> public final val expect: Expect<E, T> defined in net.corda.testing.ExpectCompose.Single[PropertyDescriptorImpl]

'clazz' @ [227:65] ==> public final val clazz: Class<T> defined in net.corda.testing.Expect[PropertyDescriptorImpl]

'ExpectComposeState<E>' @ [234:9] ==> private constructor ExpectComposeState<E : Any>() defined in net.corda.testing.ExpectComposeState[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'state' @ [236:24] ==> public final val state: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'nextState' @ [236:30] ==> public abstract fun nextState(event: E): Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'event' @ [236:40] ==> value-parameter event: E defined in net.corda.testing.ExpectComposeState.Sequential.nextState[ValueParameterDescriptorImpl]

'if (next == null) {
                null
            } else if (next.second is Finished) {
                if (index == sequential.sequence.size - 1) {
                    Pair(next.first, Finished<E>())
                } else {
                    val nextState = fromExpectCompose(sequential.sequence[index + 1])
                    if (nextState is Finished) {
                        Pair(next.first, Finished<E>())
                    } else {
                        Pair(next.first, Sequential(sequential, index + 1, nextState))
                    }
                }
            } else {
                Pair(next.first, Sequential(sequential, index, next.second))
            }' @ [237:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>?, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>?): Pair<() -> Unit, ExpectComposeState<E>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>?

'next' @ [237:24] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'if (next.second is Finished) {
                if (index == sequential.sequence.size - 1) {
                    Pair(next.first, Finished<E>())
                } else {
                    val nextState = fromExpectCompose(sequential.sequence[index + 1])
                    if (nextState is Finished) {
                        Pair(next.first, Finished<E>())
                    } else {
                        Pair(next.first, Sequential(sequential, index + 1, nextState))
                    }
                }
            } else {
                Pair(next.first, Sequential(sequential, index, next.second))
            }' @ [239:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>): Pair<() -> Unit, ExpectComposeState<E>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>

'next' @ [239:24] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'second' @ [239:29] ==> public final val second: ExpectComposeState<E> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (index == sequential.sequence.size - 1) {
                    Pair(next.first, Finished<E>())
                } else {
                    val nextState = fromExpectCompose(sequential.sequence[index + 1])
                    if (nextState is Finished) {
                        Pair(next.first, Finished<E>())
                    } else {
                        Pair(next.first, Sequential(sequential, index + 1, nextState))
                    }
                }' @ [240:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>): Pair<() -> Unit, ExpectComposeState<E>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>

'index' @ [240:21] ==> public final val index: Int defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'sequential' @ [240:30] ==> public final val sequential: ExpectCompose.Sequential<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'sequence' @ [240:41] ==> public final val sequence: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Sequential[PropertyDescriptorImpl]

'size' @ [240:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Pair' @ [241:21] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState.Finished<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> Finished<E>

'next' @ [241:26] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'first' @ [241:31] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Finished' @ [241:38] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'fromExpectCompose' @ [243:37] ==> public final fun <E : Any> fromExpectCompose(expectCompose: ExpectCompose<E>): ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : Any> -> E

'sequential' @ [243:55] ==> public final val sequential: ExpectCompose.Sequential<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'sequence' @ [243:66] ==> public final val sequence: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Sequential[PropertyDescriptorImpl]

'index' @ [243:75] ==> public final val index: Int defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'if (nextState is Finished) {
                        Pair(next.first, Finished<E>())
                    } else {
                        Pair(next.first, Sequential(sequential, index + 1, nextState))
                    }' @ [244:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<() -> Unit, ExpectComposeState<E>>, elseBranch: Pair<() -> Unit, ExpectComposeState<E>>): Pair<() -> Unit, ExpectComposeState<E>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Function0<Unit>, ExpectComposeState<E>>

'nextState' @ [244:25] ==> val nextState: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'Pair' @ [245:25] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState.Finished<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> Finished<E>

'next' @ [245:30] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'first' @ [245:35] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Finished' @ [245:42] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'Pair' @ [247:25] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState.Sequential<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> Sequential<E>

'next' @ [247:30] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'first' @ [247:35] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Sequential' @ [247:42] ==> public constructor Sequential<E : Any>(sequential: ExpectCompose.Sequential<E>, index: Int, state: ExpectComposeState<E>) defined in net.corda.testing.ExpectComposeState.Sequential[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'sequential' @ [247:53] ==> public final val sequential: ExpectCompose.Sequential<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'index' @ [247:65] ==> public final val index: Int defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'nextState' @ [247:76] ==> val nextState: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'Pair' @ [251:17] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState.Sequential<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> Sequential<E>

'next' @ [251:22] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'first' @ [251:27] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Sequential' @ [251:34] ==> public constructor Sequential<E : Any>(sequential: ExpectCompose.Sequential<E>, index: Int, state: ExpectComposeState<E>) defined in net.corda.testing.ExpectComposeState.Sequential[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'sequential' @ [251:45] ==> public final val sequential: ExpectCompose.Sequential<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'index' @ [251:57] ==> public final val index: Int defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'next' @ [251:64] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Sequential.nextState[LocalVariableDescriptor]

'second' @ [251:69] ==> public final val second: ExpectComposeState<E> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'state' @ [255:44] ==> public final val state: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Sequential[PropertyDescriptorImpl]

'getExpectedEvents' @ [255:50] ==> public abstract fun getExpectedEvents(): List<Class<out E>> defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'ExpectComposeState<E>' @ [261:9] ==> private constructor ExpectComposeState<E : Any>() defined in net.corda.testing.ExpectComposeState[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'states' @ [263:13] ==> public final val states: List<ExpectComposeState<E>> defined in net.corda.testing.ExpectComposeState.Parallel[PropertyDescriptorImpl]

'forEachIndexed' @ [263:20] ==> public inline fun <T> Iterable<ExpectComposeState<E>>.forEachIndexed(action: (index: Int, ExpectComposeState<E>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectComposeState<E>

'state' @ [264:28] ==> value-parameter state: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[ValueParameterDescriptorImpl]

'nextState' @ [264:34] ==> public abstract fun nextState(event: E): Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'event' @ [264:44] ==> value-parameter event: E defined in net.corda.testing.ExpectComposeState.Parallel.nextState[ValueParameterDescriptorImpl]

'next' @ [265:21] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'states' @ [266:38] ==> public final val states: List<ExpectComposeState<E>> defined in net.corda.testing.ExpectComposeState.Parallel[PropertyDescriptorImpl]

'mapIndexed' @ [266:45] ==> public inline fun <T, R> Iterable<ExpectComposeState<E>>.mapIndexed(transform: (index: Int, ExpectComposeState<E>) -> ExpectComposeState<E>): List<ExpectComposeState<E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectComposeState<E>
    <R> -> ExpectComposeState<E>

'if (i == stateIndex) next.second else expectComposeState' @ [267:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpectComposeState<E>, elseBranch: ExpectComposeState<E>): ExpectComposeState<E>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpectComposeState<E>

'i' @ [267:29] ==> value-parameter i: Int defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateIndex' @ [267:34] ==> value-parameter stateIndex: Int defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [267:46] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'second' @ [267:51] ==> public final val second: ExpectComposeState<E> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'expectComposeState' @ [267:63] ==> value-parameter expectComposeState: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (nextStates.all { it is Finished }) {
                        return Pair(next.first, Finished())
                    } else {
                        return Pair(next.first, Parallel(parallel, nextStates))
                    }' @ [269:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nextStates' @ [269:25] ==> val nextStates: List<ExpectComposeState<E>> defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'all' @ [269:36] ==> public inline fun <T> Iterable<ExpectComposeState<E>>.all(predicate: (ExpectComposeState<E>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectComposeState<E>

'it' @ [269:42] ==> value-parameter it: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Pair' @ [270:32] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> ExpectComposeState<E>

'next' @ [270:37] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'first' @ [270:42] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Finished' @ [270:49] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'Pair' @ [272:32] ==> public constructor Pair<out A, out B>(first: () -> Unit, second: ExpectComposeState.Parallel<E>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Function0<Unit>
    <out B> -> Parallel<E>

'next' @ [272:37] ==> val next: Pair<() -> Unit, ExpectComposeState<E>>? defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'first' @ [272:42] ==> public final val first: () -> Unit defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Parallel' @ [272:49] ==> public constructor Parallel<E : Any>(parallel: ExpectCompose.Parallel<E>, states: List<ExpectComposeState<E>>) defined in net.corda.testing.ExpectComposeState.Parallel[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'parallel' @ [272:58] ==> public final val parallel: ExpectCompose.Parallel<E> defined in net.corda.testing.ExpectComposeState.Parallel[PropertyDescriptorImpl]

'nextStates' @ [272:68] ==> val nextStates: List<ExpectComposeState<E>> defined in net.corda.testing.ExpectComposeState.Parallel.nextState.<anonymous>[LocalVariableDescriptor]

'states' @ [279:44] ==> public final val states: List<ExpectComposeState<E>> defined in net.corda.testing.ExpectComposeState.Parallel[PropertyDescriptorImpl]

'flatMap' @ [279:51] ==> public inline fun <T, R> Iterable<ExpectComposeState<E>>.flatMap(transform: (ExpectComposeState<E>) -> Iterable<Class<out E>>): List<Class<out E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectComposeState<E>
    <R> -> Class<out E>

'it' @ [279:61] ==> value-parameter it: ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Parallel.getExpectedEvents.<anonymous>[ValueParameterDescriptorImpl]

'getExpectedEvents' @ [279:64] ==> public abstract fun getExpectedEvents(): List<Class<out E>> defined in net.corda.testing.ExpectComposeState[SimpleFunctionDescriptorImpl]

'when (expectCompose) {
                is ExpectCompose.Single<E, *> -> {
                    // This coercion should not be needed but kotlin can't reason about existential type variables(T)
                    // so here we're coercing T into E (even though T is invariant).
                    @Suppress("UNCHECKED_CAST")
                    Single(expectCompose as ExpectCompose.Single<E, E>)
                }
                is ExpectCompose.Sequential -> {
                    if (expectCompose.sequence.size > 0) {
                        Sequential(expectCompose, 0, fromExpectCompose(expectCompose.sequence[0]))
                    } else {
                        Finished()
                    }
                }
                is ExpectCompose.Parallel -> {
                    if (expectCompose.parallel.size > 0) {
                        Parallel(expectCompose, expectCompose.parallel.map { fromExpectCompose(it) })
                    } else {
                        Finished()
                    }
                }
            }' @ [284:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ExpectComposeState<E>, entry1: ExpectComposeState<E>, entry2: ExpectComposeState<E>): ExpectComposeState<E>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExpectComposeState<E>

'expectCompose' @ [284:26] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'Suppress' @ [288:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Single' @ [289:21] ==> public constructor Single<E : Any, T : E>(single: ExpectCompose.Single<E, E>) defined in net.corda.testing.ExpectComposeState.Single[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E
    <T : E> -> E

'expectCompose' @ [289:28] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'if (expectCompose.sequence.size > 0) {
                        Sequential(expectCompose, 0, fromExpectCompose(expectCompose.sequence[0]))
                    } else {
                        Finished()
                    }' @ [292:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpectComposeState<E>, elseBranch: ExpectComposeState<E>): ExpectComposeState<E>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpectComposeState<E>

'expectCompose' @ [292:25] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'sequence' @ [292:39] ==> public final val sequence: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Sequential[PropertyDescriptorImpl]

'size' @ [292:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Sequential' @ [293:25] ==> public constructor Sequential<E : Any>(sequential: ExpectCompose.Sequential<E>, index: Int, state: ExpectComposeState<E>) defined in net.corda.testing.ExpectComposeState.Sequential[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'expectCompose' @ [293:36] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'fromExpectCompose' @ [293:54] ==> public final fun <E : Any> fromExpectCompose(expectCompose: ExpectCompose<E>): ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : Any> -> E

'expectCompose' @ [293:72] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'sequence' @ [293:86] ==> public final val sequence: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Sequential[PropertyDescriptorImpl]

'Finished' @ [295:25] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'if (expectCompose.parallel.size > 0) {
                        Parallel(expectCompose, expectCompose.parallel.map { fromExpectCompose(it) })
                    } else {
                        Finished()
                    }' @ [299:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpectComposeState<E>, elseBranch: ExpectComposeState<E>): ExpectComposeState<E>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpectComposeState<E>

'expectCompose' @ [299:25] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'parallel' @ [299:39] ==> public final val parallel: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Parallel[PropertyDescriptorImpl]

'size' @ [299:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Parallel' @ [300:25] ==> public constructor Parallel<E : Any>(parallel: ExpectCompose.Parallel<E>, states: List<ExpectComposeState<E>>) defined in net.corda.testing.ExpectComposeState.Parallel[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

'expectCompose' @ [300:34] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'expectCompose' @ [300:49] ==> value-parameter expectCompose: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose[ValueParameterDescriptorImpl]

'parallel' @ [300:63] ==> public final val parallel: List<ExpectCompose<E>> defined in net.corda.testing.ExpectCompose.Parallel[PropertyDescriptorImpl]

'map' @ [300:72] ==> public inline fun <T, R> Iterable<ExpectCompose<E>>.map(transform: (ExpectCompose<E>) -> ExpectComposeState<E>): List<ExpectComposeState<E>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectCompose<E>
    <R> -> ExpectComposeState<E>

'fromExpectCompose' @ [300:78] ==> public final fun <E : Any> fromExpectCompose(expectCompose: ExpectCompose<E>): ExpectComposeState<E> defined in net.corda.testing.ExpectComposeState.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : Any> -> E

'it' @ [300:96] ==> value-parameter it: ExpectCompose<E> defined in net.corda.testing.ExpectComposeState.Companion.fromExpectCompose.<anonymous>[ValueParameterDescriptorImpl]

'Finished' @ [302:25] ==> public constructor Finished<E : Any>() defined in net.corda.testing.ExpectComposeState.Finished[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Any> -> E

