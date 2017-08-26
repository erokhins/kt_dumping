'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'when (size) {
            0 -> emptyList()
            1 -> listOf(factory(first()))
            else -> map(factory)
        }' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Java>, entry1: List<Java>, entry2: List<Java>): List<Java>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Java>

'size' @ [27:15] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'emptyList' @ [28:18] ==> public fun <T> emptyList(): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Java

'listOf' @ [29:18] ==> public fun <T> listOf(element: Java): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Java

'invoke' @ [29:25] ==> public abstract operator fun invoke(p1: Psi): Java defined in kotlin.Function1[FunctionInvokeDescriptor]

'first' @ [29:33] ==> public fun <T> Array<out Psi>.first(): Psi defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Psi

'map' @ [30:21] ==> public inline fun <T, R> Array<out Psi>.map(transform: (Psi) -> Java): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Psi
    <R> -> Java

'factory' @ [30:25] ==> value-parameter factory: (Psi) -> Java defined in org.jetbrains.kotlin.load.java.structure.impl.convert[ValueParameterDescriptorImpl]

'when (size) {
            0 -> emptyList()
            1 -> listOf(factory(first()))
            else -> map(factory)
        }' @ [34:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Java>, entry1: List<Java>, entry2: List<Java>): List<Java>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Java>

'size' @ [34:15] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'emptyList' @ [35:18] ==> public fun <T> emptyList(): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Java

'listOf' @ [36:18] ==> public fun <T> listOf(element: Java): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Java

'invoke' @ [36:25] ==> public abstract operator fun invoke(p1: Psi): Java defined in kotlin.Function1[FunctionInvokeDescriptor]

'first' @ [36:33] ==> public fun <T> Iterable<Psi>.first(): Psi defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Psi

'map' @ [37:21] ==> public inline fun <T, R> Iterable<Psi>.map(transform: (Psi) -> Java): List<Java> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Psi
    <R> -> Java

'factory' @ [37:25] ==> value-parameter factory: (Psi) -> Java defined in org.jetbrains.kotlin.load.java.structure.impl.convert[ValueParameterDescriptorImpl]

'classes' @ [41:9] ==> value-parameter classes: Array<PsiClass> defined in org.jetbrains.kotlin.load.java.structure.impl.classes[ValueParameterDescriptorImpl]

'convert' @ [41:17] ==> private inline fun <Psi, Java> Array<PsiClass>.convert(factory: (PsiClass) -> JavaClassImpl): List<JavaClassImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiClass
    <Java> -> JavaClassImpl

'JavaClassImpl' @ [41:27] ==> public constructor JavaClassImpl(psiClass: PsiClass) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[ClassConstructorDescriptorImpl]

'classes' @ [44:9] ==> value-parameter classes: Collection<PsiClass> defined in org.jetbrains.kotlin.load.java.structure.impl.classes[ValueParameterDescriptorImpl]

'convert' @ [44:17] ==> private fun <Psi, Java> Collection<PsiClass>.convert(factory: (PsiClass) -> JavaClassImpl): List<JavaClassImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiClass
    <Java> -> JavaClassImpl

'JavaClassImpl' @ [44:27] ==> public constructor JavaClassImpl(psiClass: PsiClass) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[ClassConstructorDescriptorImpl]

'packages' @ [47:9] ==> value-parameter packages: Array<PsiPackage> defined in org.jetbrains.kotlin.load.java.structure.impl.packages[ValueParameterDescriptorImpl]

'convert' @ [47:18] ==> private inline fun <Psi, Java> Array<PsiPackage>.convert(factory: (PsiPackage) -> JavaPackageImpl): List<JavaPackageImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiPackage
    <Java> -> JavaPackageImpl

'JavaPackageImpl' @ [47:35] ==> public constructor JavaPackageImpl(psiPackage: PsiPackage, scope: GlobalSearchScope) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl[ClassConstructorDescriptorImpl]

'psi' @ [47:51] ==> value-parameter psi: PsiPackage defined in org.jetbrains.kotlin.load.java.structure.impl.packages.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [47:56] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.structure.impl.packages[ValueParameterDescriptorImpl]

'methods' @ [50:9] ==> value-parameter methods: Collection<PsiMethod> defined in org.jetbrains.kotlin.load.java.structure.impl.methods[ValueParameterDescriptorImpl]

'convert' @ [50:17] ==> private fun <Psi, Java> Collection<PsiMethod>.convert(factory: (PsiMethod) -> JavaMethodImpl): List<JavaMethodImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiMethod
    <Java> -> JavaMethodImpl

'JavaMethodImpl' @ [50:27] ==> public constructor JavaMethodImpl(@NotNull psiMethod: PsiMethod) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaMethodImpl[JavaClassConstructorDescriptor]

'methods' @ [53:9] ==> value-parameter methods: Collection<PsiMethod> defined in org.jetbrains.kotlin.load.java.structure.impl.constructors[ValueParameterDescriptorImpl]

'convert' @ [53:17] ==> private fun <Psi, Java> Collection<PsiMethod>.convert(factory: (PsiMethod) -> JavaConstructorImpl): List<JavaConstructorImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiMethod
    <Java> -> JavaConstructorImpl

'JavaConstructorImpl' @ [53:27] ==> public constructor JavaConstructorImpl(@NotNull psiMethod: PsiMethod) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaConstructorImpl[JavaClassConstructorDescriptor]

'fields' @ [56:9] ==> value-parameter fields: Collection<PsiField> defined in org.jetbrains.kotlin.load.java.structure.impl.fields[ValueParameterDescriptorImpl]

'convert' @ [56:16] ==> private fun <Psi, Java> Collection<PsiField>.convert(factory: (PsiField) -> JavaFieldImpl): List<JavaFieldImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiField
    <Java> -> JavaFieldImpl

'JavaFieldImpl' @ [56:26] ==> public constructor JavaFieldImpl(@NotNull psiField: PsiField) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaFieldImpl[JavaClassConstructorDescriptor]

'parameters' @ [59:9] ==> value-parameter parameters: Array<PsiParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.valueParameters[ValueParameterDescriptorImpl]

'convert' @ [59:20] ==> private inline fun <Psi, Java> Array<PsiParameter>.convert(factory: (PsiParameter) -> JavaValueParameterImpl): List<JavaValueParameterImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiParameter
    <Java> -> JavaValueParameterImpl

'JavaValueParameterImpl' @ [59:30] ==> public constructor JavaValueParameterImpl(@NotNull psiParameter: PsiParameter) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaValueParameterImpl[JavaClassConstructorDescriptor]

'typeParameters' @ [62:9] ==> value-parameter typeParameters: Array<PsiTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.typeParameters[ValueParameterDescriptorImpl]

'convert' @ [62:24] ==> private inline fun <Psi, Java> Array<PsiTypeParameter>.convert(factory: (PsiTypeParameter) -> JavaTypeParameterImpl): List<JavaTypeParameterImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiTypeParameter
    <Java> -> JavaTypeParameterImpl

'JavaTypeParameterImpl' @ [62:34] ==> public constructor JavaTypeParameterImpl(@NotNull psiTypeParameter: PsiTypeParameter) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaTypeParameterImpl[JavaClassConstructorDescriptor]

'classTypes' @ [65:9] ==> value-parameter classTypes: Array<PsiClassType> defined in org.jetbrains.kotlin.load.java.structure.impl.classifierTypes[ValueParameterDescriptorImpl]

'convert' @ [65:20] ==> private inline fun <Psi, Java> Array<PsiClassType>.convert(factory: (PsiClassType) -> JavaClassifierTypeImpl): List<JavaClassifierTypeImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiClassType
    <Java> -> JavaClassifierTypeImpl

'JavaClassifierTypeImpl' @ [65:30] ==> public constructor JavaClassifierTypeImpl(@NotNull psiClassType: PsiClassType) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassifierTypeImpl[JavaClassConstructorDescriptor]

'annotations' @ [68:9] ==> value-parameter annotations: Array<out PsiAnnotation> defined in org.jetbrains.kotlin.load.java.structure.impl.annotations[ValueParameterDescriptorImpl]

'convert' @ [68:21] ==> private inline fun <Psi, Java> Array<out PsiAnnotation>.convert(factory: Function1<*, JavaAnnotationImpl>): List<JavaAnnotationImpl> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> Captured(out PsiAnnotation)
    <Java> -> JavaAnnotationImpl

'JavaAnnotationImpl' @ [68:31] ==> public constructor JavaAnnotationImpl(@NotNull psiAnnotation: PsiAnnotation) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationImpl[JavaClassConstructorDescriptor]

'nameValuePairs' @ [71:9] ==> value-parameter nameValuePairs: Array<PsiNameValuePair> defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments[ValueParameterDescriptorImpl]

'convert' @ [71:24] ==> private inline fun <Psi, Java> Array<PsiNameValuePair>.convert(factory: (PsiNameValuePair) -> JavaAnnotationArgument): List<JavaAnnotationArgument> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]
Inferred types:
    <Psi> -> PsiNameValuePair
    <Java> -> JavaAnnotationArgument

'psi' @ [72:24] ==> value-parameter psi: PsiNameValuePair defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [72:28] ==> public final val PsiNameValuePair.name: String?[MyPropertyDescriptor]

'let' @ [72:34] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'Name' @ [72:38] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'identifier' @ [72:44] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'psi' @ [73:25] ==> value-parameter psi: PsiNameValuePair defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [73:29] ==> public final val PsiNameValuePair.value: PsiAnnotationMemberValue?[MyPropertyDescriptor]

'error' @ [73:38] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'name' @ [73:88] ==> val name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments.<anonymous>[LocalVariableDescriptor]

'JavaAnnotationArgumentImpl' @ [74:13] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[FakeCallableDescriptorForObject]

'create' @ [74:40] ==> public final fun create(argument: PsiAnnotationMemberValue, name: Name?): JavaAnnotationArgument defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory[SimpleFunctionDescriptorImpl]

'value' @ [74:47] ==> val value: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments.<anonymous>[LocalVariableDescriptor]

'name' @ [74:54] ==> val name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.namedAnnotationArguments.<anonymous>[LocalVariableDescriptor]

