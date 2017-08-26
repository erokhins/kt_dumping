'super' @ [28:34] ==> public constructor KtClassOrObject(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtClassOrObject[ClassConstructorDescriptorImpl]

'node' @ [28:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.<init>[ValueParameterDescriptorImpl]

'super' @ [29:43] ==> public constructor KtClassOrObject(stub: KotlinClassOrObjectStub<out KtClassOrObject>, nodeType: IStubElementType<*, *>) defined in org.jetbrains.kotlin.psi.KtClassOrObject[ClassConstructorDescriptorImpl]

'stub' @ [29:49] ==> value-parameter stub: KotlinObjectStub defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.<init>[ValueParameterDescriptorImpl]

'OBJECT_DECLARATION' @ [29:74] ==> public final val OBJECT_DECLARATION: (KtObjectElementType..KtObjectElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'stub' @ [32:17] ==> public final val KtObjectDeclaration.stub: KotlinClassOrObjectStub<out KtClassOrObject>?[MyPropertyDescriptor]

'super' @ [35:9] ==> <this> defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[LazyClassReceiverParameterDescriptor]

'getName' @ [35:15] ==> @Override public open fun getName(): String? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'let' @ [35:26] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'it' @ [35:39] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.getName.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [37:13] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'!' @ [37:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTopLevel' @ [37:31] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'DEFAULT_NAME_FOR_COMPANION_OBJECT' @ [39:33] ==> public final val DEFAULT_NAME_FOR_COMPANION_OBJECT: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'toString' @ [39:67] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'NonNls' @ [45:26] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'if (nameIdentifier == null) {
            val psiFactory = KtPsiFactory(project)
            val result = addAfter(psiFactory.createIdentifier(name), getObjectKeyword()!!)
            addAfter(psiFactory.createWhiteSpace(), getObjectKeyword()!!)

            result
        }
        else {
            super.setName(name)
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'nameIdentifier' @ [46:20] ==> public final val KtObjectDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'KtPsiFactory' @ [47:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [47:43] ==> public final val KtObjectDeclaration.project: Project[MyPropertyDescriptor]

'addAfter' @ [48:26] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'psiFactory' @ [48:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.setName[LocalVariableDescriptor]

'createIdentifier' @ [48:46] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'name' @ [48:63] ==> value-parameter @NonNls name: String defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.setName[ValueParameterDescriptorImpl]

'getObjectKeyword' @ [48:70] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'addAfter' @ [49:13] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'psiFactory' @ [49:22] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.setName[LocalVariableDescriptor]

'createWhiteSpace' @ [49:33] ==> public final fun createWhiteSpace(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'getObjectKeyword' @ [49:53] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'result' @ [51:13] ==> val result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.setName[LocalVariableDescriptor]

'super' @ [54:13] ==> <this> defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[LazyClassReceiverParameterDescriptor]

'setName' @ [54:19] ==> @Override public open fun setName(@NonNls @NotNull name: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'name' @ [54:27] ==> value-parameter @NonNls name: String defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.setName[ValueParameterDescriptorImpl]

'_stub' @ [58:34] ==> private final val _stub: KotlinObjectStub? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[PropertyDescriptorImpl]

'isCompanion' @ [58:41] ==> public abstract fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinObjectStub[SimpleFunctionDescriptorImpl]

'hasModifier' @ [58:58] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'COMPANION_KEYWORD' @ [58:79] ==> public final val COMPANION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'nameIdentifier' @ [60:41] ==> public final val KtObjectDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'textRange' @ [60:57] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [60:68] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'getObjectKeyword' @ [61:44] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'textRange' @ [61:65] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [61:75] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'visitor' @ [64:16] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.accept[ValueParameterDescriptorImpl]

'visitObjectDeclaration' @ [64:24] ==> public open fun visitObjectDeclaration(@NotNull declaration: KtObjectDeclaration, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [64:47] ==> <this> defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[LazyClassReceiverParameterDescriptor]

'data' @ [64:53] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtObjectDeclaration.accept[ValueParameterDescriptorImpl]

'_stub' @ [67:38] ==> private final val _stub: KotlinObjectStub? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[PropertyDescriptorImpl]

'isObjectLiteral' @ [67:45] ==> public abstract fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinObjectStub[SimpleFunctionDescriptorImpl]

'parent' @ [67:67] ==> public final val KtObjectDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findChildByType' @ [69:43] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'OBJECT_KEYWORD' @ [69:68] ==> public final val OBJECT_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'emptyList' @ [71:69] ==> public fun <T> emptyList(): List<KtObjectDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration

