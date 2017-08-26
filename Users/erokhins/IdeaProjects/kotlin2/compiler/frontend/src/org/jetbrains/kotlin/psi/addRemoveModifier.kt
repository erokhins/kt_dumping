'firstChild' @ [28:18] ==> public final val KtModifierListOwner.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [29:14] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]

'dropWhile' @ [30:14] ==> public fun <T> Sequence<PsiElement>.dropWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [30:26] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifierList.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [30:46] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifierList.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [31:14] ==> public fun <T> Sequence<PsiElement>.first(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'addBefore' @ [32:12] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'newModifierList' @ [32:22] ==> value-parameter newModifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifierList[ValueParameterDescriptorImpl]

'anchor' @ [32:39] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifierList[LocalVariableDescriptor]

'owner' @ [36:12] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.createModifierList[ValueParameterDescriptorImpl]

'addModifierList' @ [36:18] ==> private fun KtModifierListOwner.addModifierList(newModifierList: KtModifierList): KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [36:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'owner' @ [36:47] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.createModifierList[ValueParameterDescriptorImpl]

'createModifierList' @ [36:54] ==> public final fun createModifierList(text: String): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'text' @ [36:73] ==> value-parameter text: String defined in org.jetbrains.kotlin.psi.addRemoveModifier.createModifierList[ValueParameterDescriptorImpl]

'modifierList' @ [40:31] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (currentModifierList != null) {
        currentModifierList.replace(newModifierList)
    }
    else {
        addModifierList(newModifierList)
    }' @ [41:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'currentModifierList' @ [41:9] ==> val currentModifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.setModifierList[LocalVariableDescriptor]

'currentModifierList' @ [42:9] ==> val currentModifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.setModifierList[LocalVariableDescriptor]

'replace' @ [42:29] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'newModifierList' @ [42:37] ==> value-parameter newModifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.setModifierList[ValueParameterDescriptorImpl]

'addModifierList' @ [45:9] ==> private fun KtModifierListOwner.addModifierList(newModifierList: KtModifierList): KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'newModifierList' @ [45:25] ==> value-parameter newModifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.setModifierList[ValueParameterDescriptorImpl]

'owner' @ [50:24] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'modifierList' @ [50:30] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (modifierList == null) {
        createModifierList(modifier.value, owner)
    }
    else {
        addModifier(modifierList, modifier)
    }' @ [51:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'modifierList' @ [51:9] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'createModifierList' @ [52:9] ==> private fun createModifierList(text: String, owner: KtModifierListOwner): KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'modifier' @ [52:28] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'value' @ [52:37] ==> public final val KtModifierKeywordToken.value: String[MyPropertyDescriptor]

'owner' @ [52:44] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'addModifier' @ [55:9] ==> internal fun addModifier(modifierList: KtModifierList, modifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'modifierList' @ [55:21] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'modifier' @ [55:35] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'owner' @ [60:24] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[ValueParameterDescriptorImpl]

'modifierList' @ [60:30] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (modifierList == null) {
        createModifierList(annotationEntry.text, owner).annotationEntries.first()
    }
    else {
        modifierList.addBefore(annotationEntry, modifierList.firstChild) as KtAnnotationEntry
    }' @ [61:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtAnnotationEntry, elseBranch: KtAnnotationEntry): KtAnnotationEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtAnnotationEntry

'modifierList' @ [61:16] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[LocalVariableDescriptor]

'createModifierList' @ [62:9] ==> private fun createModifierList(text: String, owner: KtModifierListOwner): KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [62:28] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[ValueParameterDescriptorImpl]

'text' @ [62:44] ==> public final val KtAnnotationEntry.text: (String..String?)[MyPropertyDescriptor]

'owner' @ [62:50] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[ValueParameterDescriptorImpl]

'annotationEntries' @ [62:57] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'first' @ [62:75] ==> public fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>.first(): (KtAnnotationEntry..KtAnnotationEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'modifierList' @ [65:9] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[LocalVariableDescriptor]

'addBefore' @ [65:22] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'annotationEntry' @ [65:32] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[ValueParameterDescriptorImpl]

'modifierList' @ [65:49] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addAnnotationEntry[LocalVariableDescriptor]

'firstChild' @ [65:62] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'modifierList' @ [70:9] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'hasModifier' @ [70:22] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'modifier' @ [70:34] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [72:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'modifierList' @ [72:36] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'createModifier' @ [72:50] ==> public final fun createModifier(modifier: KtModifierKeywordToken): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'modifier' @ [72:65] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'MODIFIERS_TO_REPLACE' @ [73:29] ==> private val MODIFIERS_TO_REPLACE: Map<(KtModifierKeywordToken..KtModifierKeywordToken?), List<(KtModifierKeywordToken..KtModifierKeywordToken?)>> defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[PropertyDescriptorImpl]

'modifier' @ [73:50] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'mapNotNull' @ [74:15] ==> public inline fun <T, R : Any> Iterable<(KtModifierKeywordToken..KtModifierKeywordToken?)>.mapNotNull(transform: ((KtModifierKeywordToken..KtModifierKeywordToken?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)
    <R : Any> -> PsiElement

'modifierList' @ [74:28] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'getModifier' @ [74:41] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'it' @ [74:53] ==> value-parameter it: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [75:15] ==> public fun <T> List<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'modifier' @ [77:9] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'FINAL_KEYWORD' @ [77:21] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [77:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifierList' @ [77:39] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'hasModifier' @ [77:52] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [77:64] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifierToReplace' @ [78:13] ==> val modifierToReplace: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'modifierToReplace' @ [79:13] ==> val modifierToReplace: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'delete' @ [79:31] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'modifierList' @ [80:17] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'firstChild' @ [80:30] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'modifierList' @ [81:17] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'delete' @ [81:30] ==> @Override public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'if (modifierToReplace != null) {
        modifierToReplace.replace(newModifier)
    }
    else {
        val newModifierOrder = MODIFIERS_ORDER.indexOf(modifier)

        fun placeAfter(child: PsiElement): Boolean {
            if (child is PsiWhiteSpace) return false
            if (child is KtAnnotation) return true // place modifiers after annotations
            val elementType = child.node!!.elementType
            val order = MODIFIERS_ORDER.indexOf(elementType)
            return newModifierOrder > order
        }

        val lastChild = modifierList.lastChild
        val anchor = lastChild?.siblings(forward = false)?.firstOrNull(::placeAfter)
        modifierList.addAfter(newModifier, anchor)

        if (anchor == lastChild) { // add line break if needed, otherwise visibility keyword may appear on previous line
            val whiteSpace = modifierList.nextSibling as? PsiWhiteSpace
            if (whiteSpace != null && whiteSpace.text.contains('\n')) {
                modifierList.addAfter(whiteSpace, anchor)
                whiteSpace.delete()
            }
        }
    }' @ [86:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'modifierToReplace' @ [86:9] ==> val modifierToReplace: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'modifierToReplace' @ [87:9] ==> val modifierToReplace: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'replace' @ [87:27] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newModifier' @ [87:35] ==> val newModifier: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'MODIFIERS_ORDER' @ [90:32] ==> private val MODIFIERS_ORDER: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[PropertyDescriptorImpl]

'indexOf' @ [90:48] ==> public abstract fun indexOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'modifier' @ [90:56] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'child' @ [93:17] ==> value-parameter child: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.placeAfter[ValueParameterDescriptorImpl]

'child' @ [94:17] ==> value-parameter child: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.placeAfter[ValueParameterDescriptorImpl]

'child' @ [95:31] ==> value-parameter child: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.placeAfter[ValueParameterDescriptorImpl]

'node' @ [95:37] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [95:44] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'MODIFIERS_ORDER' @ [96:25] ==> private val MODIFIERS_ORDER: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[PropertyDescriptorImpl]

'indexOf' @ [96:41] ==> public fun <@OnlyInputTypes T> List<(IElementType..IElementType?)>.indexOf(element: (IElementType..IElementType?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'elementType' @ [96:49] ==> val elementType: IElementType defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.placeAfter[LocalVariableDescriptor]

'newModifierOrder' @ [97:20] ==> val newModifierOrder: Int defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'order' @ [97:39] ==> val order: Int defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier.placeAfter[LocalVariableDescriptor]

'modifierList' @ [100:25] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'lastChild' @ [100:38] ==> public final val KtModifierList.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'lastChild' @ [101:22] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'siblings' @ [101:33] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [101:60] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'modifierList' @ [102:9] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'addAfter' @ [102:22] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'newModifier' @ [102:31] ==> val newModifier: PsiElement defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'anchor' @ [102:44] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'anchor' @ [104:13] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'lastChild' @ [104:23] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'modifierList' @ [105:30] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'nextSibling' @ [105:43] ==> public final val KtModifierList.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whiteSpace' @ [106:17] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'whiteSpace' @ [106:39] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'text' @ [106:50] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [106:55] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'modifierList' @ [107:17] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[ValueParameterDescriptorImpl]

'addAfter' @ [107:30] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'whiteSpace' @ [107:39] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'anchor' @ [107:51] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'whiteSpace' @ [108:17] ==> val whiteSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.psi.addRemoveModifier.addModifier[LocalVariableDescriptor]

'delete' @ [108:28] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'owner' @ [115:5] ==> value-parameter owner: KtModifierListOwner defined in org.jetbrains.kotlin.psi.addRemoveModifier.removeModifier[ValueParameterDescriptorImpl]

'modifierList' @ [115:11] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [115:25] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> Unit

'it' @ [116:9] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.removeModifier.<anonymous>[ValueParameterDescriptorImpl]

'getModifier' @ [116:12] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'modifier' @ [116:24] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.addRemoveModifier.removeModifier[ValueParameterDescriptorImpl]

'delete' @ [116:35] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'it' @ [117:13] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.removeModifier.<anonymous>[ValueParameterDescriptorImpl]

'firstChild' @ [117:16] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [118:13] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.psi.addRemoveModifier.removeModifier.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [118:16] ==> @Override public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'mapOf' @ [123:36] ==> public fun <K, V> mapOf(vararg pairs: Pair<(KtModifierKeywordToken..KtModifierKeywordToken?), List<(KtModifierKeywordToken..KtModifierKeywordToken?)>>): Map<(KtModifierKeywordToken..KtModifierKeywordToken?), List<(KtModifierKeywordToken..KtModifierKeywordToken?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)
    <V> -> List<(org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)>

'OVERRIDE_KEYWORD' @ [124:9] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [124:29] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'OPEN_KEYWORD' @ [124:36] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ABSTRACT_KEYWORD' @ [125:9] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [125:29] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'OPEN_KEYWORD' @ [125:36] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [125:50] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [126:9] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [126:25] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'FINAL_KEYWORD' @ [126:32] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ABSTRACT_KEYWORD' @ [126:47] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [127:9] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [127:26] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'ABSTRACT_KEYWORD' @ [127:33] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [127:51] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [128:9] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [128:27] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PROTECTED_KEYWORD' @ [128:34] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [128:53] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [128:70] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [129:9] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [129:30] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC_KEYWORD' @ [129:37] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [129:53] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [129:70] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [130:9] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [130:28] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC_KEYWORD' @ [130:35] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [130:51] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [130:70] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [131:9] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [131:29] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC_KEYWORD' @ [131:36] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [131:52] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [131:71] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'HEADER_KEYWORD' @ [132:9] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [132:27] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'IMPL_KEYWORD' @ [132:34] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IMPL_KEYWORD' @ [133:9] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [133:25] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'HEADER_KEYWORD' @ [133:32] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [136:31] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PUBLIC_KEYWORD' @ [136:38] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [136:54] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_KEYWORD' @ [136:73] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [136:90] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [137:38] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [137:53] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ABSTRACT_KEYWORD' @ [137:67] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SEALED_KEYWORD' @ [137:85] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'CONST_KEYWORD' @ [138:38] ==> public final val CONST_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXTERNAL_KEYWORD' @ [139:38] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OVERRIDE_KEYWORD' @ [140:38] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LATEINIT_KEYWORD' @ [141:38] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'TAILREC_KEYWORD' @ [142:38] ==> public final val TAILREC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'VARARG_KEYWORD' @ [143:38] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SUSPEND_KEYWORD' @ [144:38] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INNER_KEYWORD' @ [145:38] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ENUM_KEYWORD' @ [146:38] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANNOTATION_KEYWORD' @ [146:52] ==> public final val ANNOTATION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'COMPANION_KEYWORD' @ [147:38] ==> public final val COMPANION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INLINE_KEYWORD' @ [148:38] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INFIX_KEYWORD' @ [149:38] ==> public final val INFIX_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPERATOR_KEYWORD' @ [150:38] ==> public final val OPERATOR_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DATA_KEYWORD' @ [151:38] ==> public final val DATA_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

