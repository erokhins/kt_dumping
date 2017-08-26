'when(element) {
        is KtClassOrObject -> element.fqName?.asString()
        is KtNamedFunction -> getJavaQualifiedName(LightClassUtil.getLightClassMethod(element))
        is KtProperty -> getJavaQualifiedName(LightClassUtil.getLightClassPropertyMethods(element).getter)
        else -> null
    }' @ [33:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'element' @ [33:64] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getQualifiedName[ValueParameterDescriptorImpl]

'element' @ [34:31] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getQualifiedName[ValueParameterDescriptorImpl]

'fqName' @ [34:39] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [34:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getJavaQualifiedName' @ [35:31] ==> private final fun getJavaQualifiedName(method: PsiMethod?): String? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider[SimpleFunctionDescriptorImpl]

'getLightClassMethod' @ [35:67] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [35:87] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getQualifiedName[ValueParameterDescriptorImpl]

'getJavaQualifiedName' @ [36:26] ==> private final fun getJavaQualifiedName(method: PsiMethod?): String? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider[SimpleFunctionDescriptorImpl]

'getLightClassPropertyMethods' @ [36:62] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [36:91] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getQualifiedName[ValueParameterDescriptorImpl]

'getter' @ [36:100] ==> public final val getter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[DeserializedPropertyDescriptor]

'method' @ [40:60] ==> value-parameter method: PsiMethod? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getJavaQualifiedName[ValueParameterDescriptorImpl]

'let' @ [40:68] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> String?

'JavaQualifiedNameProvider' @ [40:74] ==> public constructor JavaQualifiedNameProvider() defined in com.intellij.ide.actions.JavaQualifiedNameProvider[JavaClassConstructorDescriptor]

'getQualifiedName' @ [40:102] ==> @Nullable public open fun getQualifiedName(p0: (PsiElement..PsiElement?)): String? defined in com.intellij.ide.actions.JavaQualifiedNameProvider[JavaMethodDescriptor]

'method' @ [40:119] ==> value-parameter method: PsiMethod? defined in org.jetbrains.kotlin.idea.actions.KotlinQualifiedNameProvider.getJavaQualifiedName[ValueParameterDescriptorImpl]

