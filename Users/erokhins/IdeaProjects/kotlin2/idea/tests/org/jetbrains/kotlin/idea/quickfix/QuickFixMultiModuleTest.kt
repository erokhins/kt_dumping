'AbstractQuickFixMultiModuleTest' @ [24:33] ==> public constructor AbstractQuickFixMultiModuleTest() defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[ClassConstructorDescriptorImpl]

'arrayOf' @ [27:65] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, TargetPlatformKind.Jvm>): Array<Pair<String, TargetPlatformKind.Jvm>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, Jvm>

'to' @ [27:73] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.Jvm): Pair<String, TargetPlatformKind.Jvm> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Jvm

'TargetPlatformKind' @ [27:82] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [27:101] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JVM_1_6' @ [27:115] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'module' @ [30:22] ==> protected final fun module(name: String, jdk: TestJdkKind, hasTestRoot: Boolean): Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'headerName' @ [30:29] ==> value-parameter headerName: String = ... defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'withTests' @ [30:55] ==> value-parameter withTests: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'header' @ [31:9] ==> val header: Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[LocalVariableDescriptor]

'createFacet' @ [31:16] ==> public fun Module.createFacet(platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs in file AbstractMultiModuleTest.kt[SimpleFunctionDescriptorImpl]

'Common' @ [31:47] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'impls' @ [33:9] ==> value-parameter vararg impls: Pair<String, TargetPlatformKind<*>> = ... defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'forEach' @ [33:15] ==> public inline fun <T> Array<out Pair<String, TargetPlatformKind<*>>>.forEach(action: (Pair<String, TargetPlatformKind<*>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TargetPlatformKind<*>>

'component1' @ [33:26] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [33:36] ==> public final operator fun component2(): TargetPlatformKind<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'module' @ [34:30] ==> protected final fun module(name: String, jdk: TestJdkKind, hasTestRoot: Boolean): Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'implName' @ [34:37] ==> val implName: String defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest.<anonymous>[LocalVariableDescriptor]

'withTests' @ [34:61] ==> value-parameter withTests: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'implModule' @ [35:13] ==> val implModule: Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest.<anonymous>[LocalVariableDescriptor]

'createFacet' @ [35:24] ==> public fun Module.createFacet(platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs in file AbstractMultiModuleTest.kt[SimpleFunctionDescriptorImpl]

'implKind' @ [35:36] ==> val implKind: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest.<anonymous>[LocalVariableDescriptor]

'implModule' @ [36:13] ==> val implModule: Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest.<anonymous>[LocalVariableDescriptor]

'enableMultiPlatform' @ [36:24] ==> protected final fun Module.enableMultiPlatform(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'implModule' @ [37:13] ==> val implModule: Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest.<anonymous>[LocalVariableDescriptor]

'addDependency' @ [37:24] ==> protected final fun Module.addDependency(other: Module, dependencyScope: DependencyScope, exported: Boolean): Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'header' @ [37:38] ==> val header: Module defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest.doMultiPlatformTest[LocalVariableDescriptor]

'doQuickFixTest' @ [40:9] ==> protected final fun doQuickFixTest(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'doMultiPlatformTest' @ [44:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'arrayOf' @ [44:38] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, TargetPlatformKind<TargetPlatformVersion>>): Array<Pair<String, TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, TargetPlatformKind<TargetPlatformVersion>>

'to' @ [44:46] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.Jvm): Pair<String, TargetPlatformKind.Jvm> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Jvm

'TargetPlatformKind' @ [44:55] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [44:74] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JVM_1_6' @ [44:88] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'to' @ [44:98] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.JavaScript): Pair<String, TargetPlatformKind.JavaScript> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> JavaScript

'JavaScript' @ [44:125] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Test' @ [47:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [49:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'to' @ [49:37] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.JavaScript): Pair<String, TargetPlatformKind.JavaScript> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> JavaScript

'JavaScript' @ [49:64] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [54:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [57:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [59:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'to' @ [59:37] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.JavaScript): Pair<String, TargetPlatformKind.JavaScript> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> JavaScript

'JavaScript' @ [59:64] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Test' @ [62:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [64:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [67:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [69:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [72:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [74:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [77:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [79:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [82:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [84:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [89:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [92:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [94:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [97:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [99:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [102:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [104:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'to' @ [104:37] ==> public infix fun <A, B> String.to(that: TargetPlatformKind.JavaScript): Pair<String, TargetPlatformKind.JavaScript> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> JavaScript

'JavaScript' @ [104:64] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Test' @ [107:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doMultiPlatformTest' @ [109:9] ==> private final fun doMultiPlatformTest(headerName: String = ..., vararg impls: Pair<String, TargetPlatformKind<*>> = ..., withTests: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [112:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [113:46] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [116:44] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [119:46] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [121:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [122:66] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [124:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [125:44] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [128:37] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [130:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [131:35] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [133:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [134:54] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [136:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [137:52] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [139:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [140:54] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [142:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [143:52] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [145:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [146:57] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [148:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [149:55] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [151:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [152:57] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'Test' @ [154:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTestHeaderWithJvmAndJs' @ [155:55] ==> private final fun doTestHeaderWithJvmAndJs(): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

