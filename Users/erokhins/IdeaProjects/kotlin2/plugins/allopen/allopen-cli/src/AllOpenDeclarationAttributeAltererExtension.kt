'AbstractAllOpenDeclarationAttributeAltererExtension' @ [30:5] ==> public constructor AbstractAllOpenDeclarationAttributeAltererExtension() defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension[ClassConstructorDescriptorImpl]

'allOpenAnnotationFqNames' @ [31:82] ==> private final val allOpenAnnotationFqNames: List<String> defined in org.jetbrains.kotlin.allopen.CliAllOpenDeclarationAttributeAltererExtension[PropertyDescriptorImpl]

'listOf' @ [36:37] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'currentModality' @ [47:13] ==> value-parameter currentModality: Modality defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'FINAL' @ [47:41] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'declaration' @ [51:26] ==> value-parameter declaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'containingDeclaration' @ [51:61] ==> value-parameter containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'descriptor' @ [52:13] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[LocalVariableDescriptor]

'hasSpecialAnnotation' @ [52:24] ==> public open fun DeclarationDescriptor.hasSpecialAnnotation(modifierListOwner: KtModifierListOwner?): Boolean defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension[DeserializedSimpleFunctionDescriptor]

'modifierListOwner' @ [52:45] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'if (!isImplicitModality && modifierListOwner.hasModifier(KtTokens.FINAL_KEYWORD))
                Modality.FINAL // Explicit final
            else
                Modality.OPEN' @ [53:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modality?, elseBranch: Modality?): Modality?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modality?

'!' @ [53:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isImplicitModality' @ [53:25] ==> value-parameter isImplicitModality: Boolean defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'modifierListOwner' @ [53:47] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.allopen.AbstractAllOpenDeclarationAttributeAltererExtension.refineDeclarationModality[ValueParameterDescriptorImpl]

'hasModifier' @ [53:65] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'FINAL_KEYWORD' @ [53:86] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL' @ [54:26] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [56:26] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

