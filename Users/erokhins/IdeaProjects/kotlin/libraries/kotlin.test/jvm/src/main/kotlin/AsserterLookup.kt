'AtomicBoolean' @ [8:22] ==> public constructor AtomicBoolean() defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'ReentrantLock' @ [9:20] ==> public constructor ReentrantLock() defined in java.util.concurrent.locks.ReentrantLock[JavaClassConstructorDescriptor]

'ArrayList' @ [10:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AsserterContributor

'lookup' @ [12:48] ==> internal fun lookup(): Asserter defined in kotlin.test in file AsserterLookup.kt[SimpleFunctionDescriptorImpl]

'DefaultAsserter' @ [14:31] ==> public constructor DefaultAsserter() defined in kotlin.test.DefaultAsserter[ClassConstructorDescriptorImpl]

'initContributorsIfNeeded' @ [17:5] ==> private fun initContributorsIfNeeded(): Unit defined in kotlin.test in file AsserterLookup.kt[SimpleFunctionDescriptorImpl]

'contributors' @ [19:25] ==> private val contributors: ArrayList<AsserterContributor> defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'contributor' @ [20:24] ==> val contributor: AsserterContributor defined in kotlin.test.lookup[LocalVariableDescriptor]

'contribute' @ [20:36] ==> public abstract fun contribute(): Asserter? defined in kotlin.test.AsserterContributor[SimpleFunctionDescriptorImpl]

'asserter' @ [21:13] ==> val asserter: Asserter? defined in kotlin.test.lookup[LocalVariableDescriptor]

'asserter' @ [22:20] ==> val asserter: Asserter? defined in kotlin.test.lookup[LocalVariableDescriptor]

'defaultAsserter' @ [26:12] ==> private val defaultAsserter: DefaultAsserter defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'contributors' @ [30:5] ==> private val contributors: ArrayList<AsserterContributor> defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'clear' @ [30:18] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'load' @ [31:32] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(AsserterContributor..AsserterContributor?)>..Class<(AsserterContributor..AsserterContributor?)>?)): (ServiceLoader<(AsserterContributor..AsserterContributor?)>..ServiceLoader<(AsserterContributor..AsserterContributor?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> AsserterContributor

'java' @ [31:64] ==> public val <T> KClass<AsserterContributor>.java: Class<AsserterContributor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AsserterContributor

'loader' @ [33:25] ==> val loader: (ServiceLoader<(AsserterContributor..AsserterContributor?)>..ServiceLoader<(AsserterContributor..AsserterContributor?)>?) defined in kotlin.test.initContributors[LocalVariableDescriptor]

'contributor' @ [34:13] ==> val contributor: (AsserterContributor..AsserterContributor?) defined in kotlin.test.initContributors[LocalVariableDescriptor]

'contributors' @ [35:13] ==> private val contributors: ArrayList<AsserterContributor> defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'add' @ [35:26] ==> public open fun add(element: AsserterContributor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'contributor' @ [35:30] ==> val contributor: (AsserterContributor..AsserterContributor?) defined in kotlin.test.initContributors[LocalVariableDescriptor]

'!' @ [41:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inited' @ [41:10] ==> private val inited: AtomicBoolean defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'get' @ [41:17] ==> public final fun get(): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'lock' @ [42:9] ==> private val lock: ReentrantLock defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'withLock' @ [42:14] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'inited' @ [43:17] ==> private val inited: AtomicBoolean defined in kotlin.test in file AsserterLookup.kt[PropertyDescriptorImpl]

'compareAndSet' @ [43:24] ==> public final fun compareAndSet(p0: Boolean, p1: Boolean): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'initContributors' @ [44:17] ==> private fun initContributors(): Unit defined in kotlin.test in file AsserterLookup.kt[SimpleFunctionDescriptorImpl]

