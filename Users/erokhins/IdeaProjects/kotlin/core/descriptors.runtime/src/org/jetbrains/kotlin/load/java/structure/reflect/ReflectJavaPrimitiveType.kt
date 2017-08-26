'ReflectJavaType' @ [23:70] ==> public constructor ReflectJavaType() defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[ClassConstructorDescriptorImpl]

'if (reflectType == Void.TYPE)
            null
        else
            JvmPrimitiveType.get(reflectType.name).primitiveType' @ [25:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrimitiveType?, elseBranch: PrimitiveType?): PrimitiveType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrimitiveType?

'reflectType' @ [25:21] ==> protected open val reflectType: Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaPrimitiveType[PropertyDescriptorImpl]

'TYPE' @ [25:41] ==> public final val TYPE: (Class<(Void..Void?)>..Class<(Void..Void?)>?) defined in java.lang.Void[JavaPropertyDescriptor]

'get' @ [28:30] ==> @NotNull public open fun get(@NotNull name: String): JvmPrimitiveType defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[JavaMethodDescriptor]

'reflectType' @ [28:34] ==> protected open val reflectType: Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaPrimitiveType[PropertyDescriptorImpl]

'name' @ [28:46] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'primitiveType' @ [28:52] ==> public final val JvmPrimitiveType.primitiveType: PrimitiveType[MyPropertyDescriptor]

