'PsiElementMemberChooserObject' @ [43:5] ==> public constructor PsiElementMemberChooserObject(@NotNull p0: PsiElement, p1: (String..String?), @Nullable p2: Icon?) defined in com.intellij.codeInsight.generation.PsiElementMemberChooserObject[JavaClassConstructorDescriptor]

'psiElement' @ [43:35] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.<init>[ValueParameterDescriptorImpl]

'getText' @ [43:77] ==> public final fun getText(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [43:85] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.<init>[ValueParameterDescriptorImpl]

'getIcon' @ [43:128] ==> public final fun getIcon(declaration: PsiElement?, descriptor: DeclarationDescriptor): Icon? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion[SimpleFunctionDescriptorImpl]

'psiElement' @ [43:136] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [43:148] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [46:22] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[PropertyDescriptorImpl]

'containingDeclaration' @ [46:33] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'error' @ [46:58] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [46:80] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[PropertyDescriptorImpl]

'if (psiElement is KtDeclaration) { // kotlin
            PsiTreeUtil.getStubOrPsiParentOfType(psiElement, KtNamedDeclaration::class.java)
                ?: PsiTreeUtil.getStubOrPsiParentOfType(psiElement, KtFile::class.java)
        }
        else { // java or compiled
            (psiElement as PsiMember).containingClass
        }' @ [48:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'psiElement' @ [48:31] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'?:' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement?

'getStubOrPsiParentOfType' @ [49:25] ==> @Nullable @Contract public open fun <E : (PsiElement..PsiElement?)> getStubOrPsiParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtNamedDeclaration..KtNamedDeclaration?)>): KtNamedDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'psiElement' @ [49:50] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'java' @ [49:88] ==> public val <T> KClass<KtNamedDeclaration>.java: Class<KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'getStubOrPsiParentOfType' @ [50:32] ==> @Nullable @Contract public open fun <E : (PsiElement..PsiElement?)> getStubOrPsiParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtFile..KtFile?)>): KtFile? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'psiElement' @ [50:57] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'KtFile' @ [50:69] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [50:83] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'psiElement' @ [53:14] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'containingClass' @ [53:39] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'error' @ [54:14] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [54:36] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'when (declaration) {
            is KtFile -> PsiElementMemberChooserObject(declaration, declaration.name)
            else -> DescriptorMemberChooserObject(declaration, parent)
        }' @ [56:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberChooserObject, entry1: MemberChooserObject): MemberChooserObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberChooserObject

'declaration' @ [56:22] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.getParentNodeDelegate[LocalVariableDescriptor]

'PsiElementMemberChooserObject' @ [57:26] ==> public constructor PsiElementMemberChooserObject(@NotNull p0: PsiElement, p1: (String..String?)) defined in com.intellij.codeInsight.generation.PsiElementMemberChooserObject[JavaClassConstructorDescriptor]

'declaration' @ [57:56] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.getParentNodeDelegate[LocalVariableDescriptor]

'declaration' @ [57:69] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.getParentNodeDelegate[LocalVariableDescriptor]

'name' @ [57:81] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'DescriptorMemberChooserObject' @ [58:21] ==> public constructor DescriptorMemberChooserObject(psiElement: PsiElement, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[ClassConstructorDescriptorImpl]

'declaration' @ [58:51] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.getParentNodeDelegate[LocalVariableDescriptor]

'parent' @ [58:64] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.getParentNodeDelegate[LocalVariableDescriptor]

'this' @ [62:40] ==> <this> defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[LazyClassReceiverParameterDescriptor]

'other' @ [62:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.equals[ValueParameterDescriptorImpl]

'other' @ [62:58] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.equals[ValueParameterDescriptorImpl]

'descriptor' @ [62:100] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[PropertyDescriptorImpl]

'other' @ [62:114] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.equals[ValueParameterDescriptorImpl]

'descriptor' @ [62:120] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[PropertyDescriptorImpl]

'descriptor' @ [64:31] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[PropertyDescriptorImpl]

'hashCode' @ [64:42] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [66:33] ==> public final val DescriptorMemberChooserObject.psiElement: PsiElement[MyPropertyDescriptor]

'DescriptorRenderer' @ [69:39] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [69:58] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [70:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [71:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [71:25] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'startFromName' @ [72:13] ==> public abstract var startFromName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'classifierNamePolicy' @ [73:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'SHORT' @ [73:57] ==> public object SHORT : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'if (descriptor is ClassDescriptor)
                descriptor.fqNameUnsafe.render()
            else
                MEMBER_RENDERER.render(descriptor)' @ [77:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [77:24] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getText[ValueParameterDescriptorImpl]

'descriptor' @ [78:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getText[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [78:28] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'render' @ [78:41] ==> public fun FqNameUnsafe.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'MEMBER_RENDERER' @ [80:17] ==> private final val MEMBER_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion[PropertyDescriptorImpl]

'render' @ [80:33] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [80:40] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getText[ValueParameterDescriptorImpl]

'if (declaration != null && declaration.isValid) {
                val isClass = declaration is PsiClass || declaration is KtClass
                val flags = if (isClass) 0 else Iconable.ICON_FLAG_VISIBILITY
                return if (declaration is KtDeclaration) {
                    // kotlin declaration
                    // visibility and abstraction better detect by a descriptor
                    KotlinDescriptorIconProvider.getIcon(descriptor, declaration, flags)
                }
                else {
                    // it is better to show java icons for java code
                    declaration.getIcon(flags)
                }
            }
            else {
                return KotlinDescriptorIconProvider.getIcon(descriptor, declaration, 0)
            }' @ [84:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaration' @ [84:17] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'declaration' @ [84:40] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'isValid' @ [84:52] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'declaration' @ [85:31] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'declaration' @ [85:58] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'if (isClass) 0 else Iconable.ICON_FLAG_VISIBILITY' @ [86:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isClass' @ [86:33] ==> val isClass: Boolean defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[LocalVariableDescriptor]

'ICON_FLAG_VISIBILITY' @ [86:58] ==> public const final val ICON_FLAG_VISIBILITY: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'if (declaration is KtDeclaration) {
                    // kotlin declaration
                    // visibility and abstraction better detect by a descriptor
                    KotlinDescriptorIconProvider.getIcon(descriptor, declaration, flags)
                }
                else {
                    // it is better to show java icons for java code
                    declaration.getIcon(flags)
                }' @ [87:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon?, elseBranch: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon?

'declaration' @ [87:28] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'getIcon' @ [90:50] ==> @Nullable public open fun getIcon(@NotNull descriptor: DeclarationDescriptor, @Nullable declaration: PsiElement?, @Iconable.IconFlags flags: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'descriptor' @ [90:58] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'declaration' @ [90:70] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'flags' @ [90:83] ==> val flags: Int defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[LocalVariableDescriptor]

'declaration' @ [94:21] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'getIcon' @ [94:33] ==> public abstract fun getIcon(@Iconable.IconFlags p0: Int): (Icon..Icon?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'flags' @ [94:41] ==> val flags: Int defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[LocalVariableDescriptor]

'getIcon' @ [98:53] ==> @Nullable public open fun getIcon(@NotNull descriptor: DeclarationDescriptor, @Nullable declaration: PsiElement?, @Iconable.IconFlags flags: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'descriptor' @ [98:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

'declaration' @ [98:73] ==> value-parameter declaration: PsiElement? defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject.Companion.getIcon[ValueParameterDescriptorImpl]

