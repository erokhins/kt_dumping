'JvmOverloads' @ [26:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'LPAR' @ [27:116] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addItemBefore' @ [28:16] ==> @JvmOverloads public final fun <TItem : KtElement> addItemBefore(list: KtElement, allItems: List<TItem>, item: TItem, anchor: TItem?, prefix: KtToken = ...): TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TItem : KtElement> -> TItem

'list' @ [28:30] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItem[ValueParameterDescriptorImpl]

'allItems' @ [28:36] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItem[ValueParameterDescriptorImpl]

'item' @ [28:46] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItem[ValueParameterDescriptorImpl]

'prefix' @ [28:58] ==> value-parameter prefix: KtToken = ... defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItem[ValueParameterDescriptorImpl]

'JvmOverloads' @ [31:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'LPAR' @ [32:137] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'assert' @ [33:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'anchor' @ [33:16] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'anchor' @ [33:34] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'parent' @ [33:41] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'list' @ [33:51] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'if (allItems.isEmpty()) {
            return if (list.firstChild?.node?.elementType == prefix) {
                list.addAfter(item, list.firstChild) as TItem
            }
            else {
                list.add(item) as TItem
            }
        }
        else {
            var comma = KtPsiFactory(list).createComma()
            return if (anchor != null) {
                comma = list.addAfter(comma, anchor)
                list.addAfter(item, comma) as TItem
            }
            else {
                comma = list.addBefore(comma, allItems.first())
                list.addBefore(item, comma) as TItem
            }
        }' @ [34:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'allItems' @ [34:13] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'isEmpty' @ [34:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (list.firstChild?.node?.elementType == prefix) {
                list.addAfter(item, list.firstChild) as TItem
            }
            else {
                list.add(item) as TItem
            }' @ [35:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TItem, elseBranch: TItem): TItem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TItem

'list' @ [35:24] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'firstChild' @ [35:29] ==> public final val KtElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [35:41] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [35:47] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'prefix' @ [35:62] ==> value-parameter prefix: KtToken = ... defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'list' @ [36:17] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'addAfter' @ [36:22] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'item' @ [36:31] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'list' @ [36:37] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'firstChild' @ [36:42] ==> public final val KtElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'list' @ [39:17] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'add' @ [39:22] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'item' @ [39:26] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [43:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'list' @ [43:38] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'createComma' @ [43:44] ==> public final fun createComma(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'if (anchor != null) {
                comma = list.addAfter(comma, anchor)
                list.addAfter(item, comma) as TItem
            }
            else {
                comma = list.addBefore(comma, allItems.first())
                list.addBefore(item, comma) as TItem
            }' @ [44:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TItem, elseBranch: TItem): TItem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TItem

'anchor' @ [44:24] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'comma' @ [45:17] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'list' @ [45:25] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'addAfter' @ [45:30] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'comma' @ [45:39] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'anchor' @ [45:46] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'list' @ [46:17] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'addAfter' @ [46:22] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'item' @ [46:31] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'comma' @ [46:37] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'comma' @ [49:17] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'list' @ [49:25] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'addBefore' @ [49:30] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'comma' @ [49:40] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'allItems' @ [49:47] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'first' @ [49:56] ==> public fun <T> List<TItem>.first(): TItem defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TItem

'list' @ [50:17] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'addBefore' @ [50:22] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'item' @ [50:32] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[ValueParameterDescriptorImpl]

'comma' @ [50:38] ==> var comma: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemAfter[LocalVariableDescriptor]

'JvmOverloads' @ [55:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'LPAR' @ [56:138] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'anchorAfter' @ [58:9] ==> val anchorAfter: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[LocalVariableDescriptor]

'if (allItems.isEmpty()) {
            assert(anchor == null)
            null
        }
        else {
            if (anchor != null) {
                val index = allItems.indexOf(anchor)
                assert(index >= 0)
                if (index > 0) allItems[index - 1] else null
            }
            else {
                allItems[allItems.size - 1]
            }
        }' @ [58:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TItem?, elseBranch: TItem?): TItem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TItem?

'allItems' @ [58:27] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'isEmpty' @ [58:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'assert' @ [59:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'anchor' @ [59:20] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'if (anchor != null) {
                val index = allItems.indexOf(anchor)
                assert(index >= 0)
                if (index > 0) allItems[index - 1] else null
            }
            else {
                allItems[allItems.size - 1]
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TItem?, elseBranch: TItem?): TItem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TItem?

'anchor' @ [63:17] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'allItems' @ [64:29] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'indexOf' @ [64:38] ==> public abstract fun indexOf(element: TItem): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'anchor' @ [64:46] ==> value-parameter anchor: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'assert' @ [65:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'index' @ [65:24] ==> val index: Int defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[LocalVariableDescriptor]

'if (index > 0) allItems[index - 1] else null' @ [66:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TItem?, elseBranch: TItem?): TItem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TItem?

'index' @ [66:21] ==> val index: Int defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[LocalVariableDescriptor]

'allItems' @ [66:32] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'index' @ [66:41] ==> val index: Int defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[LocalVariableDescriptor]

'allItems' @ [69:17] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'allItems' @ [69:26] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'size' @ [69:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'addItemAfter' @ [72:16] ==> @JvmOverloads public final fun <TItem : KtElement> addItemAfter(list: KtElement, allItems: List<TItem>, item: TItem, anchor: TItem?, prefix: KtToken = ...): TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TItem : KtElement> -> TItem

'list' @ [72:29] ==> value-parameter list: KtElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'allItems' @ [72:35] ==> value-parameter allItems: List<TItem> defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'item' @ [72:45] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'anchorAfter' @ [72:51] ==> val anchorAfter: TItem? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[LocalVariableDescriptor]

'prefix' @ [72:64] ==> value-parameter prefix: KtToken = ... defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.addItemBefore[ValueParameterDescriptorImpl]

'item' @ [76:21] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[ValueParameterDescriptorImpl]

'siblings' @ [76:26] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [76:55] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [76:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [76:93] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'comma' @ [77:13] ==> var comma: PsiElement? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[LocalVariableDescriptor]

'node' @ [77:20] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [77:26] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COMMA' @ [77:50] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'comma' @ [78:13] ==> var comma: PsiElement? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[LocalVariableDescriptor]

'item' @ [78:21] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[ValueParameterDescriptorImpl]

'siblings' @ [78:26] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [78:72] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [78:86] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [78:110] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'comma' @ [79:17] ==> var comma: PsiElement? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[LocalVariableDescriptor]

'node' @ [79:24] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [79:30] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COMMA' @ [79:54] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'comma' @ [80:17] ==> var comma: PsiElement? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[LocalVariableDescriptor]

'item' @ [84:9] ==> value-parameter item: TItem defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[ValueParameterDescriptorImpl]

'delete' @ [84:14] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'comma' @ [85:9] ==> var comma: PsiElement? defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper.removeItem[LocalVariableDescriptor]

'delete' @ [85:16] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

