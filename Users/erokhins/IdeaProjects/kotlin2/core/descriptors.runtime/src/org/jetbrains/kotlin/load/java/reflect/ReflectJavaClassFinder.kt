'classId' @ [29:29] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[ValueParameterDescriptorImpl]

'packageFqName' @ [29:37] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'classId' @ [30:33] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [30:41] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [30:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [30:70] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (packageFqName.isRoot) relativeClassName
                else packageFqName.asString() + "." + relativeClassName' @ [32:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'packageFqName' @ [32:21] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'isRoot' @ [32:35] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'relativeClassName' @ [32:43] ==> val relativeClassName: String defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'packageFqName' @ [33:22] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'asString' @ [33:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'relativeClassName' @ [33:55] ==> val relativeClassName: String defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'classLoader' @ [35:21] ==> private final val classLoader: ClassLoader defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder[PropertyDescriptorImpl]

'tryLoadClass' @ [35:33] ==> public fun ClassLoader.tryLoadClass(fqName: String): Class<*>? defined in org.jetbrains.kotlin.load.java.reflect in file ReflectJavaClassFinder.kt[SimpleFunctionDescriptorImpl]

'name' @ [35:46] ==> val name: String defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'if (klass != null) ReflectJavaClass(klass) else null' @ [36:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaClass?, elseBranch: JavaClass?): JavaClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaClass?

'klass' @ [36:20] ==> val klass: Class<*>? defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'ReflectJavaClass' @ [36:35] ==> public constructor ReflectJavaClass(klass: Class<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClass[ClassConstructorDescriptorImpl]

'klass' @ [36:52] ==> val klass: Class<*>? defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findClass[LocalVariableDescriptor]

'ReflectJavaPackage' @ [41:16] ==> public constructor ReflectJavaPackage(fqName: FqName) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaPackage[ClassConstructorDescriptorImpl]

'fqName' @ [41:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.reflect.ReflectJavaClassFinder.findPackage[ValueParameterDescriptorImpl]

'loadClass' @ [49:13] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'fqName' @ [49:23] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.load.java.reflect.tryLoadClass[ValueParameterDescriptorImpl]

