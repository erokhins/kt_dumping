'classLoader' @ [29:16] ==> private final val classLoader: ClassLoader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder[PropertyDescriptorImpl]

'tryLoadClass' @ [29:28] ==> public fun ClassLoader.tryLoadClass(fqName: String): Class<*>? defined in org.jetbrains.kotlin.load.java.reflect in file ReflectJavaClassFinder.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [29:41] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder.findKotlinClass[ValueParameterDescriptorImpl]

'let' @ [29:50] ==> @InlineOnly public inline fun <T, R> Class<*>.let(block: (Class<*>) -> ReflectKotlinClass?): ReflectKotlinClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>
    <R> -> ReflectKotlinClass?

'ReflectKotlinClass' @ [29:56] ==> public companion object Factory defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[FakeCallableDescriptorForObject]

'create' @ [29:75] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[SimpleFunctionDescriptorImpl]

'it' @ [29:82] ==> value-parameter it: Class<*> defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder.findKotlinClass.<anonymous>[ValueParameterDescriptorImpl]

'findKotlinClass' @ [32:54] ==> private final fun findKotlinClass(fqName: String): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder[SimpleFunctionDescriptorImpl]

'classId' @ [32:70] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder.findKotlinClass[ValueParameterDescriptorImpl]

'toRuntimeFqName' @ [32:78] ==> private fun ClassId.toRuntimeFqName(): String defined in org.jetbrains.kotlin.load.kotlin.reflect in file ReflectKotlinClassFinder.kt[SimpleFunctionDescriptorImpl]

'findKotlinClass' @ [36:16] ==> private final fun findKotlinClass(fqName: String): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder[SimpleFunctionDescriptorImpl]

'javaClass' @ [36:32] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClassFinder.findKotlinClass[ValueParameterDescriptorImpl]

'fqName' @ [36:42] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [36:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'relativeClassName' @ [50:21] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [50:39] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [50:50] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (packageFqName.isRoot) className else "$packageFqName.$className"' @ [51:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'packageFqName' @ [51:16] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'isRoot' @ [51:30] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'className' @ [51:38] ==> val className: String defined in org.jetbrains.kotlin.load.kotlin.reflect.toRuntimeFqName[LocalVariableDescriptor]

'packageFqName' @ [51:55] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'className' @ [51:70] ==> val className: String defined in org.jetbrains.kotlin.load.kotlin.reflect.toRuntimeFqName[LocalVariableDescriptor]

