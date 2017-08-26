'LightIdentifier' @ [32:5] ==> public constructor LightIdentifier(p0: (PsiManager..PsiManager?), p1: (String..String?)) defined in com.intellij.psi.impl.light.LightIdentifier[JavaClassConstructorDescriptor]

'lightOwner' @ [32:21] ==> value-parameter lightOwner: PsiNameIdentifierOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier.<init>[ValueParameterDescriptorImpl]

'manager' @ [32:32] ==> public final val PsiNameIdentifierOwner.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'ktDeclaration' @ [32:41] ==> value-parameter ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier.<init>[ValueParameterDescriptorImpl]

'name' @ [32:56] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'when (ktDeclaration) {
            is KtSecondaryConstructor -> ktDeclaration.getConstructorKeyword()
            is KtPrimaryConstructor -> ktDeclaration.getConstructorKeyword()
                                       ?: ktDeclaration.valueParameterList
                                       ?: ktDeclaration.containingClassOrObject?.nameIdentifier
            else -> ktDeclaration?.nameIdentifier
        }' @ [34:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'ktDeclaration' @ [34:23] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'ktDeclaration' @ [35:42] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'getConstructorKeyword' @ [35:56] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'ktDeclaration' @ [36:40] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'getConstructorKeyword' @ [36:54] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'ktDeclaration' @ [37:43] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'valueParameterList' @ [37:57] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'ktDeclaration' @ [38:43] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'containingClassOrObject' @ [38:57] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'nameIdentifier' @ [38:82] ==> public final val KtClassOrObject.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'ktDeclaration' @ [39:21] ==> private final val ktDeclaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'nameIdentifier' @ [39:36] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'lightOwner' @ [42:34] ==> private final val lightOwner: PsiNameIdentifierOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'clsDelegate' @ [42:72] ==> public abstract val clsDelegate: PsiElement defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[PropertyDescriptorImpl]

'nameIdentifier' @ [42:113] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'lightOwner' @ [45:32] ==> private final val lightOwner: PsiNameIdentifierOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'lightOwner' @ [46:40] ==> private final val lightOwner: PsiNameIdentifierOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'containingFile' @ [46:51] ==> public final val PsiNameIdentifierOwner.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'origin' @ [47:35] ==> public final val origin: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightIdentifier[PropertyDescriptorImpl]

'textRange' @ [47:43] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'EMPTY_RANGE' @ [47:66] ==> public final val EMPTY_RANGE: (TextRange..TextRange?) defined in com.intellij.openapi.util.TextRange[JavaPropertyDescriptor]

