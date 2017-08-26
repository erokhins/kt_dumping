'FqName' @ [30:32] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'SelfTargetingIntention<KtModifierListOwner>' @ [32:34] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtModifierListOwner>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtModifierListOwner

'java' @ [33:36] ==> public val <T> KClass<KtModifierListOwner>.java: Class<KtModifierListOwner> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtModifierListOwner

'component1' @ [37:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [37:26] ==> public final operator fun component2(): (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (element) {
            is KtNamedFunction -> {
                val funKeyword = element.funKeyword ?: return false
                val valueParameterList = element.valueParameterList ?: return false
                if (caretOffset !in funKeyword.startOffset..valueParameterList.endOffset) {
                    return false
                }

                "function '${element.name}'" to valueParameterList.parameters
            }
            is KtSecondaryConstructor -> {
                val constructorKeyword = element.getConstructorKeyword()
                val valueParameterList = element.valueParameterList ?: return false
                if (caretOffset !in constructorKeyword.startOffset..valueParameterList.endOffset) {
                    return false
                }

                "secondary constructor" to valueParameterList.parameters
            }
            is KtPrimaryConstructor -> {
                val parameters = (element.valueParameterList ?: return false).parameters

                // For primary constructors with all default values, a zero-arg constructor is generated anyway. If there's only one
                // parameter and it has a default value, the bytecode with and without @JvmOverloads is exactly the same.
                if (parameters.singleOrNull()?.hasDefaultValue() == true) {
                    return false
                }

                "primary constructor" to parameters
            }
            else -> return false
        }' @ [37:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)>, entry1: Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)>, entry2: Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)>, entry3: Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)>): Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<String, (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>)>

'element' @ [37:46] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [39:34] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'funKeyword' @ [39:42] ==> public final val KtNamedFunction.funKeyword: PsiElement?[MyPropertyDescriptor]

'element' @ [40:42] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameterList' @ [40:50] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'caretOffset' @ [41:21] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'funKeyword' @ [41:37] ==> val funKeyword: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'startOffset' @ [41:48] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'valueParameterList' @ [41:61] ==> val valueParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'endOffset' @ [41:80] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'to' @ [45:17] ==> public infix fun <A, B> String.to(that: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)): Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>)

'element' @ [45:30] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'name' @ [45:38] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'valueParameterList' @ [45:49] ==> val valueParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'parameters' @ [45:68] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'element' @ [48:42] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [48:50] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'element' @ [49:42] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameterList' @ [49:50] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'caretOffset' @ [50:21] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'constructorKeyword' @ [50:37] ==> val constructorKeyword: PsiElement defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'startOffset' @ [50:56] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'valueParameterList' @ [50:69] ==> val valueParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'endOffset' @ [50:88] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'to' @ [54:17] ==> public infix fun <A, B> String.to(that: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)): Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>)

'valueParameterList' @ [54:44] ==> val valueParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'parameters' @ [54:63] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'element' @ [57:35] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameterList' @ [57:43] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'parameters' @ [57:79] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameters' @ [61:21] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'singleOrNull' @ [61:32] ==> public fun <T> List<(KtParameter..KtParameter?)>.singleOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'hasDefaultValue' @ [61:48] ==> public open fun hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'to' @ [65:17] ==> public infix fun <A, B> String.to(that: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)): Pair<String, (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>)

'parameters' @ [65:42] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'text' @ [70:9] ==> public final var AddJvmOverloadsIntention.text: String[MyPropertyDescriptor]

'targetName' @ [70:52] ==> val targetName: String defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'==' @ [72:16] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [72:39] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'element' @ [72:51] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [72:59] ==> public final val KtModifierListOwner.containingKtFile: KtFile[MyPropertyDescriptor]

'JvmPlatform' @ [72:80] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'parameters' @ [73:19] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[LocalVariableDescriptor]

'any' @ [73:30] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.any(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [73:36] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [73:39] ==> public open fun hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'element' @ [74:19] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'findAnnotation' @ [74:27] ==> public fun KtAnnotated.findAnnotation(annotationFqName: FqName): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [74:42] ==> private val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.intentions in file AddJvmOverloadsIntention.kt[PropertyDescriptorImpl]

'if (element is KtPrimaryConstructor) {
            if (element.getConstructorKeyword() == null) {
                element.addBefore(KtPsiFactory(element).createConstructorKeyword(), element.valueParameterList)
            }
            element.addAnnotation(annotationFqName, whiteSpaceText = " ")
        }
        else {
            element.addAnnotation(annotationFqName)
        }' @ [78:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'element' @ [78:13] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [79:17] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [79:25] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'element' @ [80:17] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'addBefore' @ [80:25] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'KtPsiFactory' @ [80:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [80:48] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'createConstructorKeyword' @ [80:57] ==> public final fun createConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [80:85] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'valueParameterList' @ [80:93] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'element' @ [82:13] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'addAnnotation' @ [82:21] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [82:35] ==> private val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.intentions in file AddJvmOverloadsIntention.kt[PropertyDescriptorImpl]

'element' @ [85:13] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.AddJvmOverloadsIntention.applyTo[ValueParameterDescriptorImpl]

'addAnnotation' @ [85:21] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [85:35] ==> private val annotationFqName: FqName defined in org.jetbrains.kotlin.idea.intentions in file AddJvmOverloadsIntention.kt[PropertyDescriptorImpl]

