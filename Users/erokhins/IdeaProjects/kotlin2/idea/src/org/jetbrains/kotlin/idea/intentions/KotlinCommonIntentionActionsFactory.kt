'JvmCommonIntentionActionsFactory' @ [48:45] ==> public constructor JvmCommonIntentionActionsFactory() defined in com.intellij.codeInsight.intention.JvmCommonIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'declaration' @ [50:30] ==> value-parameter declaration: UDeclaration defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'asKtElement' @ [50:42] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtModifierListOwner? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtModifierListOwner

'IllegalArgumentException' @ [51:39] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'declaration' @ [51:66] ==> value-parameter declaration: UDeclaration defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'component1' @ [53:14] ==> public final operator fun component1(): (KtModifierKeywordToken..KtModifierKeywordToken?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [53:22] ==> public final operator fun component2(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (PsiModifier.FINAL == modifier)
            KtTokens.OPEN_KEYWORD to !shouldPresent
        else
            javaPsiModifiersMapping[modifier] to shouldPresent' @ [53:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<(KtModifierKeywordToken..KtModifierKeywordToken?), Boolean>, elseBranch: Pair<(KtModifierKeywordToken..KtModifierKeywordToken?), Boolean>): Pair<(KtModifierKeywordToken..KtModifierKeywordToken?), Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<(org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?), Boolean>

'==' @ [53:49] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'FINAL' @ [53:61] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'modifier' @ [53:70] ==> value-parameter modifier: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'to' @ [54:13] ==> public infix fun <A, B> (KtModifierKeywordToken..KtModifierKeywordToken?).to(that: Boolean): Pair<(KtModifierKeywordToken..KtModifierKeywordToken?), Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)
    <B> -> Boolean

'OPEN_KEYWORD' @ [54:22] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [54:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldPresent' @ [54:39] ==> value-parameter shouldPresent: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'javaPsiModifiersMapping' @ [56:13] ==> public final val javaPsiModifiersMapping: Map<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[PropertyDescriptorImpl]

'modifier' @ [56:37] ==> value-parameter modifier: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'shouldPresent' @ [56:50] ==> value-parameter shouldPresent: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[ValueParameterDescriptorImpl]

'kToken' @ [58:13] ==> val kToken: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'if (shouldPresentMapped)
            AddModifierFix.createIfApplicable(kModifierOwner, kToken)
        else
            RemoveModifierFix(kModifierOwner, kToken, false)' @ [59:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntentionAction?, elseBranch: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntentionAction?

'shouldPresentMapped' @ [59:20] ==> val shouldPresentMapped: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'createIfApplicable' @ [60:28] ==> public final fun createIfApplicable(modifierListOwner: KtModifierListOwner, modifier: KtModifierKeywordToken): AddModifierFix? defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix.Companion[SimpleFunctionDescriptorImpl]

'kModifierOwner' @ [60:47] ==> val kModifierOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'kToken' @ [60:63] ==> val kToken: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'RemoveModifierFix' @ [62:13] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'kModifierOwner' @ [62:31] ==> val kModifierOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'kToken' @ [62:47] ==> val kToken: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createChangeModifierAction[LocalVariableDescriptor]

'Fix' @ [73:17] ==> public constructor Fix(uClass: UClass, familyName: String, text: String, action: (uClass: UClass) -> Unit) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[ClassConstructorDescriptorImpl]

'uClass' @ [73:21] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'+' @ [75:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (lateinit) "lateinit " else ""' @ [75:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lateinit' @ [75:33] ==> value-parameter lateinit: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix[ValueParameterDescriptorImpl]

'if (setterRequired) "var" else "val"' @ [76:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'setterRequired' @ [76:28] ==> value-parameter setterRequired: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'propertyName' @ [76:74] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'uClass' @ [76:94] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'name' @ [76:101] ==> public final val UClass.name: String?[MyPropertyDescriptor]

'javaVisibilityMapping' @ [78:41] ==> public final val javaVisibilityMapping: Map<String, String> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[PropertyDescriptorImpl]

'getValue' @ [78:63] ==> @SinceKotlin public fun <K, V> Map<String, String>.getValue(key: String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'visibilityModifier' @ [78:72] ==> value-parameter visibilityModifier: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [79:38] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'uClass' @ [79:51] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[ValueParameterDescriptorImpl]

'if (lateinit) "lateinit $visibilityStr" else visibilityStr' @ [80:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lateinit' @ [80:47] ==> value-parameter lateinit: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix[ValueParameterDescriptorImpl]

'visibilityStr' @ [80:68] ==> val visibilityStr: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'visibilityStr' @ [80:88] ==> val visibilityStr: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [81:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'createProperty' @ [81:47] ==> public final fun createProperty(modifiers: String?, name: String, type: String?, isVar: Boolean, initializer: String?): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifiersString' @ [82:29] ==> val modifiersString: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'propertyName' @ [83:29] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'typeString' @ [84:29] ==> public final fun typeString(str: PsiType): String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[SimpleFunctionDescriptorImpl]

'propertyType' @ [84:40] ==> value-parameter propertyType: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'setterRequired' @ [85:29] ==> value-parameter setterRequired: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'if (lateinit) null else "TODO(\"initialize me\")"' @ [86:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'lateinit' @ [86:33] ==> value-parameter lateinit: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix[ValueParameterDescriptorImpl]

'uClass' @ [87:43] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[ValueParameterDescriptorImpl]

'asKtElement' @ [87:50] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtClassOrObject? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtClassOrObject

'insertMembersAfter' @ [88:21] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtProperty>, anchor: PsiElement? = ...): List<KtProperty> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtProperty

'ktClassOrObject' @ [88:46] ==> val ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'listOf' @ [88:63] ==> public fun <T> listOf(element: KtProperty): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'function' @ [88:70] ==> val function: KtProperty defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions.addPropertyFix.<anonymous>[LocalVariableDescriptor]

'if (setterRequired)
            return listOf(addPropertyFix(), addPropertyFix(lateinit = true))
        else
            return listOf(addPropertyFix())' @ [91:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'setterRequired' @ [91:13] ==> value-parameter setterRequired: Boolean defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[ValueParameterDescriptorImpl]

'listOf' @ [92:20] ==> public fun <T> listOf(vararg elements: KotlinCommonIntentionActionsFactory.Fix): List<KotlinCommonIntentionActionsFactory.Fix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix

'addPropertyFix' @ [92:27] ==> local final fun addPropertyFix(lateinit: Boolean = ...): KotlinCommonIntentionActionsFactory.Fix defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[SimpleFunctionDescriptorImpl]

'addPropertyFix' @ [92:45] ==> local final fun addPropertyFix(lateinit: Boolean = ...): KotlinCommonIntentionActionsFactory.Fix defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[SimpleFunctionDescriptorImpl]

'listOf' @ [94:20] ==> public fun <T> listOf(element: KotlinCommonIntentionActionsFactory.Fix): List<KotlinCommonIntentionActionsFactory.Fix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix

'addPropertyFix' @ [94:27] ==> local final fun addPropertyFix(lateinit: Boolean = ...): KotlinCommonIntentionActionsFactory.Fix defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddBeanPropertyActions[SimpleFunctionDescriptorImpl]

'when (info) {
                is MethodInsertionInfo.Method ->
                    createAddMethodAction(info)?.let { listOf(it) } ?: emptyList()

                is MethodInsertionInfo.Constructor ->
                    createAddConstructorActions(info)
            }' @ [98:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<IntentionAction>, entry1: List<IntentionAction>): List<IntentionAction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<IntentionAction>

'info' @ [98:19] ==> value-parameter info: MethodInsertionInfo defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddCallableMemberActions[ValueParameterDescriptorImpl]

'createAddMethodAction' @ [100:21] ==> private final fun createAddMethodAction(info: MethodInsertionInfo.Method): IntentionAction? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'info' @ [100:43] ==> value-parameter info: MethodInsertionInfo defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddCallableMemberActions[ValueParameterDescriptorImpl]

'let' @ [100:50] ==> @InlineOnly public inline fun <T, R> IntentionAction.let(block: (IntentionAction) -> List<IntentionAction>): List<IntentionAction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction
    <R> -> List<IntentionAction>

'listOf' @ [100:56] ==> public fun <T> listOf(element: IntentionAction): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'it' @ [100:63] ==> value-parameter it: IntentionAction defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddCallableMemberActions.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [100:72] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'createAddConstructorActions' @ [103:21] ==> private final fun createAddConstructorActions(info: MethodInsertionInfo.Constructor): List<IntentionAction> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'info' @ [103:49] ==> value-parameter info: MethodInsertionInfo defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddCallableMemberActions[ValueParameterDescriptorImpl]

'mapOf' @ [107:39] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (KtModifierKeywordToken..KtModifierKeywordToken?)>): Map<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'to' @ [108:17] ==> public infix fun <A, B> String.to(that: (KtModifierKeywordToken..KtModifierKeywordToken?)): Pair<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PRIVATE' @ [108:29] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [108:49] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'to' @ [109:17] ==> public infix fun <A, B> String.to(that: (KtModifierKeywordToken..KtModifierKeywordToken?)): Pair<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC' @ [109:29] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [109:48] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'to' @ [110:17] ==> public infix fun <A, B> String.to(that: (KtModifierKeywordToken..KtModifierKeywordToken?)): Pair<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PROTECTED' @ [110:29] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [110:51] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'to' @ [111:17] ==> public infix fun <A, B> String.to(that: (KtModifierKeywordToken..KtModifierKeywordToken?)): Pair<String, (KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'ABSTRACT' @ [111:29] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'ABSTRACT_KEYWORD' @ [111:50] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'mapOf' @ [114:58] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [115:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'PRIVATE' @ [115:29] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PRIVATE' @ [115:53] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'displayName' @ [115:61] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'to' @ [116:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'PUBLIC' @ [116:29] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'to' @ [117:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'PROTECTED' @ [117:29] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PROTECTED' @ [117:55] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'displayName' @ [117:65] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'to' @ [118:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'PACKAGE_LOCAL' @ [118:29] ==> public const final val PACKAGE_LOCAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'INTERNAL' @ [118:59] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'displayName' @ [118:68] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'withDefault' @ [119:11] ==> public fun <K, V> Map<String, String>.withDefault(defaultValue: (key: String) -> String): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'DEFAULT_VISIBILITY' @ [119:38] ==> public final val DEFAULT_VISIBILITY: (Visibility..Visibility?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'displayName' @ [119:57] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'when (str) {
                PsiType.VOID -> ""
                PsiType.INT -> "kotlin.Int"
                PsiType.LONG -> "kotlin.Long"
                PsiType.SHORT -> "kotlin.Short"
                PsiType.BOOLEAN -> "kotlin.Boolean"
                PsiType.BYTE -> "kotlin.Byte"
                PsiType.CHAR -> "kotlin.Char"
                PsiType.DOUBLE -> "kotlin.Double"
                PsiType.FLOAT -> "kotlin.Float"
                else -> null
            }' @ [122:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?, entry4: String?, entry5: String?, entry6: String?, entry7: String?, entry8: String?, entry9: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'str' @ [122:43] ==> value-parameter str: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[ValueParameterDescriptorImpl]

'VOID' @ [123:25] ==> public final val VOID: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'INT' @ [124:25] ==> public final val INT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'LONG' @ [125:25] ==> public final val LONG: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'SHORT' @ [126:25] ==> public final val SHORT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'BOOLEAN' @ [127:25] ==> public final val BOOLEAN: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'BYTE' @ [128:25] ==> public final val BYTE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'CHAR' @ [129:25] ==> public final val CHAR: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'DOUBLE' @ [130:25] ==> public final val DOUBLE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'FLOAT' @ [131:25] ==> public final val FLOAT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'typeName' @ [134:17] ==> var typeName: String? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[LocalVariableDescriptor]

'typeName' @ [135:17] ==> var typeName: String? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[LocalVariableDescriptor]

'JavaToKotlinClassMap' @ [135:28] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'mapJavaToKotlin' @ [135:49] ==> public final fun mapJavaToKotlin(fqName: FqName, builtIns: KotlinBuiltIns): ClassDescriptor? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'FqName' @ [135:65] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'str' @ [135:72] ==> value-parameter str: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[ValueParameterDescriptorImpl]

'canonicalText' @ [135:76] ==> public final val PsiType.canonicalText: String[MyPropertyDescriptor]

'Instance' @ [135:108] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'fqNameSafe' @ [135:119] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [135:131] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'typeName' @ [137:20] ==> var typeName: String? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[LocalVariableDescriptor]

'str' @ [137:32] ==> value-parameter str: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion.typeString[ValueParameterDescriptorImpl]

'canonicalText' @ [137:36] ==> public final val PsiType.canonicalText: String[MyPropertyDescriptor]

'psi' @ [142:14] ==> public abstract val psi: PsiElement? defined in org.jetbrains.uast.UElement[DeserializedPropertyDescriptor]

'kotlinOrigin' @ [142:46] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'component1' @ [145:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [145:22] ==> public final operator fun component2(): UParameter defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'info' @ [145:32] ==> value-parameter info: MethodInsertionInfo defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.paramsFromInfo[ValueParameterDescriptorImpl]

'parameters' @ [145:37] ==> public final val parameters: List<UParameter> defined in com.intellij.codeInsight.intention.MethodInsertionInfo[DeserializedPropertyDescriptor]

'withIndex' @ [145:48] ==> public fun <T> Iterable<UParameter>.withIndex(): Iterable<IndexedValue<UParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UParameter

'param' @ [146:13] ==> public final fun param(name: String, type: String, defaultValue: String? = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'param' @ [146:19] ==> val param: UParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.paramsFromInfo[LocalVariableDescriptor]

'name' @ [146:25] ==> public final val UParameter.name: String?[MyPropertyDescriptor]

'index' @ [146:39] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.paramsFromInfo[LocalVariableDescriptor]

'typeString' @ [146:52] ==> public final fun typeString(str: PsiType): String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[SimpleFunctionDescriptorImpl]

'param' @ [146:63] ==> val param: UParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.paramsFromInfo[LocalVariableDescriptor]

'type' @ [146:69] ==> public final val UParameter.type: PsiType[MyPropertyDescriptor]

'info' @ [151:29] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'modifiers' @ [151:34] ==> public final val modifiers: List<String> defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'map' @ [151:44] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'javaVisibilityMapping' @ [151:50] ==> public final val javaVisibilityMapping: Map<String, String> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[PropertyDescriptorImpl]

'get' @ [151:72] ==> public abstract operator fun get(key: String): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [151:76] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [151:83] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [151:88] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CallableBuilder' @ [152:30] ==> public constructor CallableBuilder(target: KtPsiFactory.CallableBuilder.Target) defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedClassConstructorDescriptor]

'FUNCTION' @ [152:46] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder.Target[FakeCallableDescriptorForObject]

'apply' @ [152:56] ==> @InlineOnly public inline fun <T> KtPsiFactory.CallableBuilder.apply(block: KtPsiFactory.CallableBuilder.() -> Unit): KtPsiFactory.CallableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableBuilder

'modifier' @ [153:13] ==> public final fun modifier(modifier: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'visibilityStr' @ [153:22] ==> val visibilityStr: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[LocalVariableDescriptor]

'typeParams' @ [154:13] ==> public final fun typeParams(values: Collection<String> = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'name' @ [155:13] ==> public final fun name(name: String = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'info' @ [155:18] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'name' @ [155:23] ==> public final val name: String defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'paramsFromInfo' @ [156:13] ==> private final fun KtPsiFactory.CallableBuilder.paramsFromInfo(info: MethodInsertionInfo): Unit defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'info' @ [156:28] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'info' @ [157:13] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'returnType' @ [157:18] ==> public final val returnType: PsiType defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'let' @ [157:29] ==> @InlineOnly public inline fun <T, R> PsiType.let(block: (PsiType) -> KtPsiFactory.CallableBuilder): KtPsiFactory.CallableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType
    <R> -> CallableBuilder

'when (it) {
                    PsiType.VOID -> noReturnType()
                    else -> returnType(typeString(it))
                }' @ [158:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtPsiFactory.CallableBuilder, entry1: KtPsiFactory.CallableBuilder): KtPsiFactory.CallableBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableBuilder

'it' @ [158:23] ==> value-parameter it: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'VOID' @ [159:29] ==> public final val VOID: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'noReturnType' @ [159:37] ==> public final fun noReturnType(): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'returnType' @ [160:29] ==> public final fun returnType(type: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'typeString' @ [160:40] ==> public final fun typeString(str: PsiType): String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Companion[SimpleFunctionDescriptorImpl]

'it' @ [160:51] ==> value-parameter it: PsiType defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'blockBody' @ [163:13] ==> public final fun blockBody(body: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'Fix' @ [166:16] ==> public constructor Fix(uClass: UClass, familyName: String, text: String, action: (uClass: UClass) -> Unit) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[ClassConstructorDescriptorImpl]

'info' @ [166:20] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'containingClass' @ [166:25] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'info' @ [166:71] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'name' @ [166:76] ==> public final val name: String defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'info' @ [166:89] ==> value-parameter info: MethodInsertionInfo.Method defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[ValueParameterDescriptorImpl]

'containingClass' @ [166:94] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Method[DeserializedPropertyDescriptor]

'name' @ [166:110] ==> public final val UClass.name: String?[MyPropertyDescriptor]

'KtPsiFactory' @ [168:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'uClass' @ [168:43] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [169:28] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[LocalVariableDescriptor]

'createFunction' @ [169:39] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'functionString' @ [169:54] ==> val functionString: KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction[LocalVariableDescriptor]

'asString' @ [169:69] ==> public final fun asString(): String defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'uClass' @ [170:35] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[ValueParameterDescriptorImpl]

'asKtElement' @ [170:42] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtClassOrObject? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtClassOrObject

'insertMembersAfter' @ [171:13] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtNamedFunction>, anchor: PsiElement? = ...): List<KtNamedFunction> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtNamedFunction

'ktClassOrObject' @ [171:38] ==> val ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[LocalVariableDescriptor]

'listOf' @ [171:55] ==> public fun <T> listOf(element: KtNamedFunction): List<KtNamedFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'function' @ [171:62] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[LocalVariableDescriptor]

'ktClassOrObject' @ [171:73] ==> val ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddMethodAction.<anonymous>[LocalVariableDescriptor]

'declarations' @ [171:89] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastOrNull' @ [171:102] ==> public fun <T> List<KtDeclaration>.lastOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'CallableBuilder' @ [177:33] ==> public constructor CallableBuilder(target: KtPsiFactory.CallableBuilder.Target) defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedClassConstructorDescriptor]

'CONSTRUCTOR' @ [177:49] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder.Target[FakeCallableDescriptorForObject]

'apply' @ [177:62] ==> @InlineOnly public inline fun <T> KtPsiFactory.CallableBuilder.apply(block: KtPsiFactory.CallableBuilder.() -> Unit): KtPsiFactory.CallableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableBuilder

'modifier' @ [178:13] ==> public final fun modifier(modifier: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'typeParams' @ [179:13] ==> public final fun typeParams(values: Collection<String> = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'name' @ [180:13] ==> public final fun name(name: String = ...): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'paramsFromInfo' @ [181:13] ==> private final fun KtPsiFactory.CallableBuilder.paramsFromInfo(info: MethodInsertionInfo): Unit defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'info' @ [181:28] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'noReturnType' @ [182:13] ==> public final fun noReturnType(): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'blockBody' @ [183:13] ==> public final fun blockBody(body: String): KtPsiFactory.CallableBuilder defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'asString' @ [184:11] ==> public final fun asString(): String defined in org.jetbrains.kotlin.psi.KtPsiFactory.CallableBuilder[DeserializedSimpleFunctionDescriptor]

'info' @ [185:34] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [185:39] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'asKtElement' @ [185:55] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtClass? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtClass

'primaryConstructor' @ [185:80] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'if (primaryConstructor == null)
            Fix(info.containingClass,
                "Add method",
                "Add primary constructor to '${info.containingClass.name}'",
                { uClass ->
                    val psiFactory = KtPsiFactory(uClass)
                    val constructor = psiFactory.createSecondaryConstructor(constructorString)
                    val ktClass = uClass.asKtElement<KtClass>()!!
                    val newPrimaryConstructor = ktClass.createPrimaryConstructorIfAbsent()
                    newPrimaryConstructor.valueParameterList!!.replace(constructor.valueParameterList!!)
                    ShortenReferences.DEFAULT.process(newPrimaryConstructor)
                })
        else Fix(info.containingClass,
                 "Add method",
                 "Add secondary constructor to '${info.containingClass.name}'",
                 { uClass ->
                     val psiFactory = KtPsiFactory(uClass)
                     val constructor = psiFactory.createSecondaryConstructor(constructorString)
                     val ktClassOrObject = uClass.asKtElement<KtClassOrObject>()!!
                     insertMembersAfter(null, ktClassOrObject, listOf(constructor), null)
                 })' @ [187:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinCommonIntentionActionsFactory.Fix, elseBranch: KotlinCommonIntentionActionsFactory.Fix): KotlinCommonIntentionActionsFactory.Fix[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Fix

'primaryConstructor' @ [187:40] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'Fix' @ [188:13] ==> public constructor Fix(uClass: UClass, familyName: String, text: String, action: (uClass: UClass) -> Unit) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[ClassConstructorDescriptorImpl]

'info' @ [188:17] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [188:22] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'info' @ [190:48] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [190:53] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'name' @ [190:69] ==> public final val UClass.name: String?[MyPropertyDescriptor]

'KtPsiFactory' @ [192:38] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'uClass' @ [192:51] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [193:39] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'createSecondaryConstructor' @ [193:50] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'constructorString' @ [193:77] ==> val constructorString: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'uClass' @ [194:35] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[ValueParameterDescriptorImpl]

'asKtElement' @ [194:42] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtClass? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtClass

'ktClass' @ [195:49] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'createPrimaryConstructorIfAbsent' @ [195:57] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newPrimaryConstructor' @ [196:21] ==> val newPrimaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'valueParameterList' @ [196:43] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'replace' @ [196:64] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'constructor' @ [196:72] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'valueParameterList' @ [196:84] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'ShortenReferences' @ [197:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [197:39] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [197:47] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newPrimaryConstructor' @ [197:55] ==> val newPrimaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'Fix' @ [199:14] ==> public constructor Fix(uClass: UClass, familyName: String, text: String, action: (uClass: UClass) -> Unit) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[ClassConstructorDescriptorImpl]

'info' @ [199:18] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [199:23] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'info' @ [201:51] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [201:56] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'name' @ [201:72] ==> public final val UClass.name: String?[MyPropertyDescriptor]

'KtPsiFactory' @ [203:39] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'uClass' @ [203:52] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [204:40] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'createSecondaryConstructor' @ [204:51] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'constructorString' @ [204:78] ==> val constructorString: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'uClass' @ [205:44] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[ValueParameterDescriptorImpl]

'asKtElement' @ [205:51] ==> private final inline fun <reified T : KtElement> UElement.asKtElement(): KtClassOrObject? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> KtClassOrObject

'insertMembersAfter' @ [206:22] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtSecondaryConstructor>, anchor: PsiElement? = ...): List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtSecondaryConstructor

'ktClassOrObject' @ [206:47] ==> val ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'listOf' @ [206:64] ==> public fun <T> listOf(element: KtSecondaryConstructor): List<KtSecondaryConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'constructor' @ [206:71] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>[LocalVariableDescriptor]

'run' @ [209:46] ==> @InlineOnly public inline fun <T, R> KotlinCommonIntentionActionsFactory.run(block: KotlinCommonIntentionActionsFactory.() -> IntentionAction?): IntentionAction? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCommonIntentionActionsFactory
    <R> -> IntentionAction?

'primaryConstructor' @ [210:17] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'getInstance' @ [211:29] ==> public open fun getInstance(): (QuickFixFactory..QuickFixFactory?) defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'createChangeMethodSignatureFromUsageFix' @ [212:22] ==> @NotNull public abstract fun createChangeMethodSignatureFromUsageFix(@NotNull p0: PsiMethod, @NotNull p1: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>), @NotNull p2: PsiSubstitutor, @NotNull p3: PsiElement, p4: Boolean, p5: Int): IntentionAction defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'!!' @ [213:29] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiMethod?): PsiMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiMethod

'getLightClassMethod' @ [213:44] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'primaryConstructor' @ [213:64] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'fakeParametersExpressions' @ [214:29] ==> private final fun fakeParametersExpressions(parameters: List<PsiParameter>): Array<PsiExpression> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'info' @ [214:55] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'parameters' @ [214:60] ==> public final val parameters: List<UParameter> defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'EMPTY' @ [215:44] ==> @NotNull public final val EMPTY: PsiSubstitutor defined in com.intellij.psi.PsiSubstitutor[JavaPropertyDescriptor]

'info' @ [215:51] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [215:56] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'takeIf' @ [216:23] ==> @InlineOnly @SinceKotlin public inline fun <T> IntentionAction.takeIf(predicate: (IntentionAction) -> Boolean): IntentionAction? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'it' @ [216:32] ==> value-parameter it: IntentionAction defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAvailable' @ [216:35] ==> public abstract fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in com.intellij.codeInsight.intention.IntentionAction[JavaMethodDescriptor]

'info' @ [216:47] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [216:52] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'project' @ [216:68] ==> public final val UClass.project: Project[MyPropertyDescriptor]

'info' @ [216:83] ==> value-parameter info: MethodInsertionInfo.Constructor defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[ValueParameterDescriptorImpl]

'containingClass' @ [216:88] ==> public final val containingClass: UClass defined in com.intellij.codeInsight.intention.MethodInsertionInfo.Constructor[DeserializedPropertyDescriptor]

'containingFile' @ [216:104] ==> public final val UClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'listOf' @ [219:16] ==> public fun <T> listOf(vararg elements: IntentionAction?): List<IntentionAction?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction?

'changePrimaryConstructorAction' @ [219:23] ==> val changePrimaryConstructorAction: IntentionAction? defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'addConstructorAction' @ [219:55] ==> val addConstructorAction: KotlinCommonIntentionActionsFactory.Fix defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.createAddConstructorActions[LocalVariableDescriptor]

'filterNotNull' @ [219:77] ==> public fun <T : Any> Iterable<IntentionAction?>.filterNotNull(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IntentionAction

'when {
                parameters.isEmpty() -> emptyArray<PsiExpression>()
                else -> JavaPsiFacade.getElementFactory(parameters.first().project)
                        .createParameterList(
                                parameters.map { it.name }.toTypedArray(),
                                parameters.map { it.type }.toTypedArray()
                        ).parameters.map { FakeExpressionFromParameter(it) }.toTypedArray()
            }' @ [223:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<PsiExpression>, entry1: Array<PsiExpression>): Array<PsiExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<PsiExpression>

'parameters' @ [224:17] ==> value-parameter parameters: List<PsiParameter> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions[ValueParameterDescriptorImpl]

'isEmpty' @ [224:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyArray' @ [224:41] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<PsiExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiExpression

'getElementFactory' @ [225:39] ==> public open fun getElementFactory(@NotNull p0: Project): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'parameters' @ [225:57] ==> value-parameter parameters: List<PsiParameter> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions[ValueParameterDescriptorImpl]

'first' @ [225:68] ==> public fun <T> List<PsiParameter>.first(): PsiParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter

'project' @ [225:76] ==> public final val PsiParameter.project: Project[MyPropertyDescriptor]

'createParameterList' @ [226:26] ==> @NotNull public abstract fun createParameterList(@NotNull @NonNls p0: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p1: (Array<(PsiType..PsiType?)>..Array<out (PsiType..PsiType?)>)): PsiParameterList defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'parameters' @ [227:33] ==> value-parameter parameters: List<PsiParameter> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions[ValueParameterDescriptorImpl]

'map' @ [227:44] ==> public inline fun <T, R> Iterable<PsiParameter>.map(transform: (PsiParameter) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter
    <R> -> String?

'it' @ [227:50] ==> value-parameter it: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [227:53] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'toTypedArray' @ [227:60] ==> public inline fun <reified T> Collection<String?>.toTypedArray(): Array<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String?

'parameters' @ [228:33] ==> value-parameter parameters: List<PsiParameter> defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions[ValueParameterDescriptorImpl]

'map' @ [228:44] ==> public inline fun <T, R> Iterable<PsiParameter>.map(transform: (PsiParameter) -> PsiType): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter
    <R> -> PsiType

'it' @ [228:50] ==> value-parameter it: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [228:53] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'toTypedArray' @ [228:60] ==> public inline fun <reified T> Collection<PsiType>.toTypedArray(): Array<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiType

'parameters' @ [229:27] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'map' @ [229:38] ==> public inline fun <T, R> Array<out (PsiParameter..PsiParameter?)>.map(transform: ((PsiParameter..PsiParameter?)) -> KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter): List<KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> FakeExpressionFromParameter

'FakeExpressionFromParameter' @ [229:44] ==> public constructor FakeExpressionFromParameter(psiParam: PsiParameter) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[ClassConstructorDescriptorImpl]

'it' @ [229:72] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.fakeParametersExpressions.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [229:78] ==> public inline fun <reified T> Collection<PsiExpression>.toTypedArray(): Array<PsiExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiExpression

'PsiReferenceExpressionImpl' @ [232:85] ==> public constructor PsiReferenceExpressionImpl() defined in com.intellij.psi.impl.source.tree.java.PsiReferenceExpressionImpl[JavaClassConstructorDescriptor]

'psiParam' @ [234:42] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'name' @ [234:51] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'psiParam' @ [236:46] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'project' @ [236:55] ==> public final val PsiParameter.project: Project[MyPropertyDescriptor]

'psiParam' @ [238:48] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'parent' @ [238:57] ==> public final val PsiParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiParam' @ [240:44] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'type' @ [240:53] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'psiParam' @ [244:53] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'containingFile' @ [244:62] ==> public final val PsiParameter.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'psiParam' @ [246:52] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'name' @ [246:61] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'psiParam' @ [248:47] ==> private final val psiParam: PsiParameter defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.FakeExpressionFromParameter[PropertyDescriptorImpl]

'LocalQuickFixAndIntentionActionOnPsiElement' @ [251:145] ==> protected/*protected and package*/ constructor LocalQuickFixAndIntentionActionOnPsiElement(@Nullable p0: PsiElement?) defined in com.intellij.codeInspection.LocalQuickFixAndIntentionActionOnPsiElement[JavaClassConstructorDescriptor]

'uClass' @ [251:189] ==> value-parameter uClass: UClass defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [252:48] ==> private final val familyName: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[PropertyDescriptorImpl]

'text' @ [254:42] ==> private final val text: String defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix[PropertyDescriptorImpl]

'invoke' @ [257:17] ==> public abstract operator fun invoke(uClass: @ParameterName UClass): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'startElement' @ [257:24] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.KotlinCommonIntentionActionsFactory.Fix.invoke[ValueParameterDescriptorImpl]

