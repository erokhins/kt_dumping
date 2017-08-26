'AtomicBoolean' @ [37:27] ==> public constructor AtomicBoolean(p0: Boolean) defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'patched' @ [40:13] ==> private final val patched: AtomicBoolean defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting[PropertyDescriptorImpl]

'get' @ [40:21] ==> public final fun get(): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'patched' @ [42:9] ==> private final val patched: AtomicBoolean defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting[PropertyDescriptorImpl]

'compareAndSet' @ [42:17] ==> public final fun compareAndSet(p0: Boolean, p1: Boolean): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'setupForkJoinCommonPool' @ [44:41] ==> public open fun setupForkJoinCommonPool(): Unit defined in com.intellij.concurrency.IdeaForkJoinWorkerThreadFactory[JavaMethodDescriptor]

'commonPool' @ [47:50] ==> public open fun commonPool(): (ForkJoinPool..ForkJoinPool?) defined in java.util.concurrent.ForkJoinPool[JavaMethodDescriptor]

'factory' @ [47:63] ==> public final val ForkJoinPool.factory: (ForkJoinPool.ForkJoinWorkerThreadFactory..ForkJoinPool.ForkJoinWorkerThreadFactory?)[MyPropertyDescriptor]

'java' @ [47:78] ==> public val <T> KClass<out ForkJoinPool.ForkJoinWorkerThreadFactory>.java: Class<out ForkJoinPool.ForkJoinWorkerThreadFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ForkJoinWorkerThreadFactory

'name' @ [47:83] ==> public final val <T : (Any..Any?)> Class<out ForkJoinPool.ForkJoinWorkerThreadFactory>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ForkJoinWorkerThreadFactory

'commonPoolFactoryName' @ [48:13] ==> val commonPoolFactoryName: (String..String?) defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

'IdeaForkJoinWorkerThreadFactory' @ [48:38] ==> public constructor IdeaForkJoinWorkerThreadFactory() defined in com.intellij.concurrency.IdeaForkJoinWorkerThreadFactory[JavaClassConstructorDescriptor]

'java' @ [48:77] ==> public val <T> KClass<IdeaForkJoinWorkerThreadFactory>.java: Class<IdeaForkJoinWorkerThreadFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IdeaForkJoinWorkerThreadFactory

'name' @ [48:82] ==> public final val <T : (Any..Any?)> Class<IdeaForkJoinWorkerThreadFactory>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IdeaForkJoinWorkerThreadFactory

'ThreadTracker' @ [54:17] ==> public constructor ThreadTracker() defined in com.intellij.testFramework.ThreadTracker[JavaClassConstructorDescriptor]

'java' @ [54:38] ==> public val <T> KClass<ThreadTracker>.java: Class<ThreadTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ThreadTracker

'getDeclaredField' @ [54:43] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'ThreadTracker' @ [57:17] ==> public constructor ThreadTracker() defined in com.intellij.testFramework.ThreadTracker[JavaClassConstructorDescriptor]

'java' @ [57:38] ==> public val <T> KClass<ThreadTracker>.java: Class<ThreadTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ThreadTracker

'declaredFields' @ [57:43] ==> public final val <T : (Any..Any?)> Class<ThreadTracker>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ThreadTracker

'single' @ [57:58] ==> public inline fun <T> Array<out (Field..Field?)>.single(predicate: ((Field..Field?)) -> Boolean): (Field..Field?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isStatic' @ [58:30] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [58:39] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [58:42] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'java' @ [58:74] ==> public val <T> KClass<MutableSet<*>>.java: Class<MutableSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MutableSet<*>

'isAssignableFrom' @ [58:79] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [58:96] ==> value-parameter it: (Field..Field?) defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [58:99] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'wellKnownOffendersField' @ [62:13] ==> val wellKnownOffendersField: (Field..Field?) defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

'isAccessible' @ [62:37] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [64:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'wellKnownOffendersField' @ [65:38] ==> val wellKnownOffendersField: (Field..Field?) defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

'get' @ [65:62] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'wellKnownOffenders' @ [67:13] ==> val wellKnownOffenders: MutableSet<String> defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

'add' @ [67:32] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'println' @ [68:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [71:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [71:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [71:57] ==> val e: NoSuchFieldException defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

'println' @ [74:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [74:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [74:57] ==> val e: IllegalAccessException defined in org.jetbrains.kotlin.idea.ThreadTrackerPatcherForTeamCityTesting.patchThreadTracker[LocalVariableDescriptor]

