'PathManager<MyPathManager>' @ [11:35] ==> public constructor PathManager<T : PathManager<PathManagerTests.MyPathManager>>(path: Path) defined in net.corda.node.services.transactions.PathManager[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PathManager<T>> -> MyPathManager

'createTempFile' @ [11:68] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?), vararg p2: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'MyPathManager' @ [11:83] ==> public constructor MyPathManager() defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[ClassConstructorDescriptorImpl]

'simpleName' @ [11:104] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'Test' @ [13:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MyPathManager' @ [15:23] ==> public constructor MyPathManager() defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[ClassConstructorDescriptorImpl]

'manager' @ [16:26] ==> val manager: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when manager closed`[LocalVariableDescriptor]

'use' @ [16:34] ==> @InlineOnly public inline fun <T : Closeable?, R> PathManagerTests.MyPathManager.use(block: (PathManagerTests.MyPathManager) -> Path): Path defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> MyPathManager
    <R> -> Path

'it' @ [17:13] ==> value-parameter it: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when manager closed`.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [17:16] ==> public final val path: Path defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[DeserializedPropertyDescriptor]

'also' @ [17:21] ==> @InlineOnly @SinceKotlin public inline fun <T> Path.also(block: (Path) -> Unit): Path defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'assertTrue' @ [17:28] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'it' @ [17:39] ==> value-parameter it: Path defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when manager closed`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [17:42] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [19:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'leakedPath' @ [19:21] ==> val leakedPath: Path defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when manager closed`[LocalVariableDescriptor]

'exists' @ [19:32] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [20:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalStateException /* = IllegalStateException */>, block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalStateException

'IllegalStateException' @ [20:25] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'manager' @ [20:57] ==> val manager: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when manager closed`[LocalVariableDescriptor]

'path' @ [20:65] ==> public final val path: Path defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[DeserializedPropertyDescriptor]

'Test' @ [23:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MyPathManager' @ [25:22] ==> public constructor MyPathManager() defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[ClassConstructorDescriptorImpl]

'use' @ [25:38] ==> @InlineOnly public inline fun <T : Closeable?, R> PathManagerTests.MyPathManager.use(block: (PathManagerTests.MyPathManager) -> PathManagerTests.MyPathManager): PathManagerTests.MyPathManager defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> MyPathManager
    <R> -> MyPathManager

'it' @ [26:13] ==> value-parameter it: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`.<anonymous>[ValueParameterDescriptorImpl]

'handle' @ [26:16] ==> public final fun handle(): PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[DeserializedSimpleFunctionDescriptor]

'handle' @ [28:26] ==> val handle: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`[LocalVariableDescriptor]

'use' @ [28:33] ==> @InlineOnly public inline fun <T : Closeable?, R> PathManagerTests.MyPathManager.use(block: (PathManagerTests.MyPathManager) -> Path): Path defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> MyPathManager
    <R> -> Path

'it' @ [29:13] ==> value-parameter it: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [29:16] ==> public final val path: Path defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[DeserializedPropertyDescriptor]

'also' @ [29:21] ==> @InlineOnly @SinceKotlin public inline fun <T> Path.also(block: (Path) -> Unit): Path defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'assertTrue' @ [29:28] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'it' @ [29:39] ==> value-parameter it: Path defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [29:42] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [31:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'leakedPath' @ [31:21] ==> val leakedPath: Path defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`[LocalVariableDescriptor]

'exists' @ [31:32] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [32:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalStateException /* = IllegalStateException */>, block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalStateException

'IllegalStateException' @ [32:25] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'handle' @ [32:57] ==> val handle: PathManagerTests.MyPathManager defined in net.corda.node.services.transactions.PathManagerTests.`path deleted when handle closed`[LocalVariableDescriptor]

'path' @ [32:64] ==> public final val path: Path defined in net.corda.node.services.transactions.PathManagerTests.MyPathManager[DeserializedPropertyDescriptor]

