'when (this) {
        is KtClassOrObject -> (resolutionFacade ?: getResolutionFacade()).resolveToDescriptor(this) as ClassDescriptor
        is PsiClass -> getJavaClassDescriptor()
        else -> null
    }' @ [35:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'this' @ [35:18] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getClassDescriptorIfAny[ReceiverParameterDescriptorImpl]

'resolutionFacade' @ [36:32] ==> value-parameter resolutionFacade: ResolutionFacade? = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getClassDescriptorIfAny[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [36:52] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolveToDescriptor' @ [36:75] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'this' @ [36:95] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getClassDescriptorIfAny[ReceiverParameterDescriptorImpl]

'getJavaClassDescriptor' @ [37:24] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (this) {
        is KtClassOrObject -> fqName?.asString()
        is PsiClass -> qualifiedName
        else -> throw AssertionError("Not a class: ${getElementTextWithContext()}")
    }' @ [44:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'this' @ [44:24] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.qualifiedClassNameForRendering[ReceiverParameterDescriptorImpl]

'fqName' @ [45:31] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [45:39] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'qualifiedName' @ [46:24] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'AssertionError' @ [47:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'getElementTextWithContext' @ [47:54] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'fqName' @ [49:12] ==> val fqName: String? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.qualifiedClassNameForRendering[LocalVariableDescriptor]

'name' @ [49:22] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'member' @ [53:18] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [54:27] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'allChildren' @ [54:34] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'toMutableList' @ [54:46] ==> public fun <T> Sequence<PsiElement>.toMutableList(): MutableList<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'isToAbstract' @ [55:9] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'member' @ [55:25] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'when (member) {
            is KtNamedFunction -> childrenToCheck.remove(member.bodyExpression as PsiElement?)
            is KtProperty -> {
                childrenToCheck.remove(member.initializer as PsiElement?)
                childrenToCheck.remove(member.delegateExpression as PsiElement?)
                childrenToCheck.removeAll(member.accessors)
            }
        }' @ [56:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'member' @ [56:15] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'childrenToCheck' @ [57:35] ==> val childrenToCheck: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'remove' @ [57:51] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out PsiElement?>.remove(element: PsiElement?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement?

'member' @ [57:58] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'bodyExpression' @ [57:65] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'childrenToCheck' @ [59:17] ==> val childrenToCheck: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'remove' @ [59:33] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out PsiElement?>.remove(element: PsiElement?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement?

'member' @ [59:40] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'initializer' @ [59:47] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'childrenToCheck' @ [60:17] ==> val childrenToCheck: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'remove' @ [60:33] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out PsiElement?>.remove(element: PsiElement?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement?

'member' @ [60:40] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'delegateExpression' @ [60:47] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'childrenToCheck' @ [61:17] ==> val childrenToCheck: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'removeAll' @ [61:33] ==> public abstract fun removeAll(elements: Collection<PsiElement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'member' @ [61:43] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'accessors' @ [61:50] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'childrenToCheck' @ [65:12] ==> val childrenToCheck: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.getChildrenToAnalyze[LocalVariableDescriptor]

'this' @ [69:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.resolveToDescriptorWrapperAware[ReceiverParameterDescriptorImpl]

'psiClass' @ [69:43] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'getJavaClassDescriptor' @ [69:52] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [69:75] ==> value-parameter resolutionFacade: ResolutionFacade? = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.resolveToDescriptorWrapperAware[ValueParameterDescriptorImpl]

'resolutionFacade' @ [70:13] ==> value-parameter resolutionFacade: ResolutionFacade? = ... defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.resolveToDescriptorWrapperAware[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [70:33] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolveToDescriptor' @ [70:56] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'this' @ [70:76] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.resolveToDescriptorWrapperAware[ReceiverParameterDescriptorImpl]

'this' @ [74:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKtDeclarationWrapperAware[ReceiverParameterDescriptorImpl]

'this' @ [74:29] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKtDeclarationWrapperAware[ReceiverParameterDescriptorImpl]

'KtPsiClassWrapper' @ [74:59] ==> public fun KtPsiClassWrapper(psiClass: PsiClass): KtPsiClassWrapper defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KtPsiClassWrapper.kt[SimpleFunctionDescriptorImpl]

'this' @ [74:77] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKtDeclarationWrapperAware[ReceiverParameterDescriptorImpl]

'namedUnwrappedElement' @ [75:12] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

