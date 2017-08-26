'showErrorHint' @ [37:22] ==> public open fun showErrorHint(@NotNull project: Project, @NotNull editor: Editor, @NotNull message: String, @NotNull title: String, @Nullable helpId: String?): Unit defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'project' @ [37:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHint[ValueParameterDescriptorImpl]

'editor' @ [37:45] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHint[ValueParameterDescriptorImpl]

'message' @ [37:53] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHint[ValueParameterDescriptorImpl]

'title' @ [37:62] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHint[ValueParameterDescriptorImpl]

'showErrorHint' @ [41:5] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [41:19] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHintByKey[ValueParameterDescriptorImpl]

'editor' @ [41:28] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHintByKey[ValueParameterDescriptorImpl]

'message' @ [41:60] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'messageKey' @ [41:68] ==> value-parameter messageKey: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHintByKey[ValueParameterDescriptorImpl]

'title' @ [41:81] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.showErrorHintByKey[ValueParameterDescriptorImpl]

'elements' @ [54:32] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[ValueParameterDescriptorImpl]

'map' @ [54:41] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'it' @ [54:47] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete.<anonymous>[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [54:50] ==> public val PsiElement.substringContextOrThis: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'?:' @ [55:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'findCommonParent' @ [55:34] ==> @Nullable public open fun findCommonParent(@NotNull p0: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'physicalElements' @ [55:51] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'AssertionError' @ [56:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'physicalElements' @ [56:82] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'joinToString' @ [56:99] ==> public fun <T> Iterable<PsiElement>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PsiElement) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'parent' @ [58:13] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'targetContainer' @ [58:23] ==> value-parameter targetContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[ValueParameterDescriptorImpl]

'invoke' @ [59:13] ==> public abstract operator fun invoke(elements: @ParameterName List<PsiElement>, targetSibling: @ParameterName PsiElement): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'elements' @ [59:26] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[ValueParameterDescriptorImpl]

'physicalElements' @ [59:36] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'first' @ [59:53] ==> public fun <T> List<@ParameterName PsiElement>.first(): @ParameterName PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> [@kotlin.ParameterName] PsiElement

'parent' @ [63:31] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'getOutermostParentContainedIn' @ [63:38] ==> public tailrec fun PsiElement.getOutermostParentContainedIn(container: PsiElement): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'targetContainer' @ [63:68] ==> value-parameter targetContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[ValueParameterDescriptorImpl]

'outermostParent' @ [64:13] ==> val outermostParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'showErrorHintByKey' @ [65:13] ==> public fun showErrorHintByKey(project: Project, editor: Editor, messageKey: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [65:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'project' @ [65:37] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'editor' @ [65:46] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'operationName' @ [65:86] ==> value-parameter operationName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'invoke' @ [69:9] ==> public abstract operator fun invoke(elements: @ParameterName List<PsiElement>, targetSibling: @ParameterName PsiElement): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'elements' @ [69:22] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[ValueParameterDescriptorImpl]

'outermostParent' @ [69:32] ==> val outermostParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling.onSelectionComplete[LocalVariableDescriptor]

'selectElementsWithTargetParent' @ [72:5] ==> public fun selectElementsWithTargetParent(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]

'operationName' @ [72:36] ==> value-parameter operationName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'editor' @ [72:51] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'file' @ [72:59] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'title' @ [72:65] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'elementKinds' @ [72:72] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'getContainers' @ [72:86] ==> value-parameter getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetSibling[ValueParameterDescriptorImpl]

'showErrorHintByKey' @ [85:9] ==> public fun showErrorHintByKey(project: Project, editor: Editor, messageKey: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [85:28] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'project' @ [85:33] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'editor' @ [85:42] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'key' @ [85:50] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.showErrorHintByKey[ValueParameterDescriptorImpl]

'operationName' @ [85:55] ==> value-parameter operationName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'elements' @ [89:32] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[ValueParameterDescriptorImpl]

'map' @ [89:41] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'it' @ [89:47] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer.<anonymous>[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [89:50] ==> public val PsiElement.substringContextOrThis: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'?:' @ [90:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'findCommonParent' @ [90:34] ==> @Nullable public open fun findCommonParent(@NotNull p0: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'physicalElements' @ [90:51] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'AssertionError' @ [91:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'physicalElements' @ [91:82] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'joinToString' @ [91:99] ==> public fun <T> Iterable<PsiElement>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PsiElement) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'invoke' @ [93:26] ==> public abstract operator fun invoke(elements: @ParameterName List<PsiElement>, commonParent: @ParameterName PsiElement): List<PsiElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'physicalElements' @ [93:40] ==> val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'parent' @ [93:58] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'containers' @ [94:13] ==> val containers: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'isEmpty' @ [94:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'showErrorHintByKey' @ [95:13] ==> local final fun showErrorHintByKey(key: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'chooseContainerElementIfNecessary' @ [99:9] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<PsiElement>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (PsiElement) -> PsiElement, onSelect: (PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiElement

'containers' @ [100:17] ==> val containers: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[LocalVariableDescriptor]

'editor' @ [101:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'title' @ [102:17] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'it' @ [104:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [105:19] ==> public abstract operator fun invoke(elements: @ParameterName List<PsiElement>, targetParent: @ParameterName PsiElement): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'elements' @ [105:32] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer[ValueParameterDescriptorImpl]

'it' @ [105:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectTargetContainer.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [110:27] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'selectionModel' @ [110:34] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionStart' @ [110:49] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'editor' @ [111:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'selectionModel' @ [111:32] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionEnd' @ [111:47] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'elementKinds' @ [113:24] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'flatMap' @ [113:37] ==> public inline fun <T, R> Iterable<CodeInsightUtils.ElementKind>.flatMap(transform: (CodeInsightUtils.ElementKind) -> Iterable<(PsiElement..PsiElement?)>): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'findElements' @ [113:64] ==> @NotNull public open fun findElements(@NotNull file: PsiFile, startOffset: Int, endOffset: Int, @NotNull kind: CodeInsightUtils.ElementKind): (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'file' @ [113:77] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'startOffset' @ [113:83] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectMultipleElements[LocalVariableDescriptor]

'endOffset' @ [113:96] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectMultipleElements[LocalVariableDescriptor]

'it' @ [113:107] ==> value-parameter it: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectMultipleElements.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [113:111] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.toList(): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'elements' @ [114:13] ==> val elements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectMultipleElements[LocalVariableDescriptor]

'isEmpty' @ [114:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'when (elementKinds.singleOrNull()) {
                CodeInsightUtils.ElementKind.EXPRESSION -> showErrorHintByKey("cannot.refactor.no.expression")
                CodeInsightUtils.ElementKind.TYPE_ELEMENT -> showErrorHintByKey("cannot.refactor.no.type")
                else -> showErrorHint(file.project, editor, "Refactoring can't be performed on the selected code element", title)
            }' @ [115:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'elementKinds' @ [115:26] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'singleOrNull' @ [115:39] ==> public fun <T> Iterable<CodeInsightUtils.ElementKind>.singleOrNull(): CodeInsightUtils.ElementKind? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [116:46] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'showErrorHintByKey' @ [116:60] ==> local final fun showErrorHintByKey(key: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'TYPE_ELEMENT' @ [117:46] ==> enum entry TYPE_ELEMENT defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'showErrorHintByKey' @ [117:62] ==> local final fun showErrorHintByKey(key: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'showErrorHint' @ [118:25] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [118:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'project' @ [118:44] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'editor' @ [118:53] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'title' @ [118:124] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'selectTargetContainer' @ [122:9] ==> local final fun selectTargetContainer(elements: List<PsiElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'elements' @ [122:31] ==> val elements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectMultipleElements[LocalVariableDescriptor]

'selectElement' @ [126:9] ==> @Throws public fun selectElement(editor: Editor, file: KtFile, failOnEmptySuggestion: Boolean, elementKinds: Collection<CodeInsightUtils.ElementKind>, callback: (PsiElement?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'editor' @ [126:23] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'file' @ [126:31] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'elementKinds' @ [126:44] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'if (expr != null) {
                selectTargetContainer(listOf(expr))
            }
            else {
                if (!editor.selectionModel.hasSelection()) {
                    if (elementKinds.singleOrNull() == CodeInsightUtils.ElementKind.EXPRESSION) {
                        val elementAtCaret = file.findElementAt(editor.caretModel.offset)
                        elementAtCaret?.getParentOfTypeAndBranch<KtProperty> { nameIdentifier }?.let {
                            return@selectElement selectTargetContainer(listOf(it))
                        }
                    }

                    editor.selectionModel.selectLineAtCaret()
                }
                selectMultipleElements()
            }' @ [127:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expr' @ [127:17] ==> value-parameter expr: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectSingleElement.<anonymous>[ValueParameterDescriptorImpl]

'selectTargetContainer' @ [128:17] ==> local final fun selectTargetContainer(elements: List<PsiElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'listOf' @ [128:39] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'expr' @ [128:46] ==> value-parameter expr: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectSingleElement.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [131:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'editor' @ [131:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'selectionModel' @ [131:29] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'hasSelection' @ [131:44] ==> public abstract fun hasSelection(): Boolean defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'elementKinds' @ [132:25] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'singleOrNull' @ [132:38] ==> public fun <T> Iterable<CodeInsightUtils.ElementKind>.singleOrNull(): CodeInsightUtils.ElementKind? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [132:85] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'file' @ [133:46] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'findElementAt' @ [133:51] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'editor' @ [133:65] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'caretModel' @ [133:72] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [133:83] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'elementAtCaret' @ [134:25] ==> val elementAtCaret: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectSingleElement.<anonymous>[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [134:41] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtProperty.() -> PsiElement?): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'nameIdentifier' @ [134:80] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [134:98] ==> @InlineOnly public inline fun <T, R> KtProperty.let(block: (KtProperty) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <R> -> Nothing

'selectTargetContainer' @ [135:50] ==> local final fun selectTargetContainer(elements: List<PsiElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'listOf' @ [135:72] ==> public fun <T> listOf(element: KtProperty): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'it' @ [135:79] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent.selectSingleElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [139:21] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'selectionModel' @ [139:28] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectLineAtCaret' @ [139:43] ==> public abstract fun selectLineAtCaret(): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'selectMultipleElements' @ [141:17] ==> local final fun selectMultipleElements(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'editor' @ [146:5] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[ValueParameterDescriptorImpl]

'scrollingModel' @ [146:12] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollToCaret' @ [146:27] ==> public abstract fun scrollToCaret(@NotNull p0: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'MAKE_VISIBLE' @ [146:52] ==> enum entry MAKE_VISIBLE defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'selectSingleElement' @ [147:5] ==> local final fun selectSingleElement(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.selectElementsWithTargetParent[SimpleFunctionDescriptorImpl]

'findDescendantOfType' @ [151:18] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(noinline predicate: (KtExpression) -> Boolean = ...): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [151:55] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionByCopyableDataAndClearIt.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [151:58] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?)): Boolean? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [151:78] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'result' @ [152:5] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionByCopyableDataAndClearIt[LocalVariableDescriptor]

'putCopyableUserData' @ [152:12] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [152:32] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'result' @ [153:12] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionByCopyableDataAndClearIt[LocalVariableDescriptor]

'findDescendantOfType' @ [157:18] ==> public inline fun <reified T : PsiElement> PsiElement.findDescendantOfType(noinline predicate: (PsiElement) -> Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiElement

'it' @ [157:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.findElementByCopyableDataAndClearIt.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [157:56] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?)): Boolean? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [157:76] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findElementByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'result' @ [158:5] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.findElementByCopyableDataAndClearIt[LocalVariableDescriptor]

'putCopyableUserData' @ [158:12] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [158:32] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findElementByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'result' @ [159:12] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.findElementByCopyableDataAndClearIt[LocalVariableDescriptor]

'collectDescendantsOfType' @ [163:19] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtExpression) -> Boolean = ...): List<KtExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [163:60] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [163:63] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?)): Boolean? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [163:83] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'results' @ [164:5] ==> val results: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt[LocalVariableDescriptor]

'forEach' @ [164:13] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [164:23] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [164:26] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'key' @ [164:46] ==> value-parameter key: Key<Boolean> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt[ValueParameterDescriptorImpl]

'results' @ [165:12] ==> val results: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionsByCopyableDataAndClearIt[LocalVariableDescriptor]

'file' @ [169:18] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'findElementAt' @ [169:23] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'startOffset' @ [169:37] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [169:51] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtStringTemplateEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtStringTemplateEntry

'file' @ [170:18] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'findElementAt' @ [170:23] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'endOffset' @ [170:37] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [170:53] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtStringTemplateEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtStringTemplateEntry

'entry1' @ [172:9] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry2' @ [172:19] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry1' @ [172:29] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry1' @ [172:83] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'expression' @ [172:90] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'entry1' @ [174:26] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'parent' @ [174:33] ==> public final val KtStringTemplateEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'entry2' @ [175:9] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'parent' @ [175:16] ==> public final val KtStringTemplateEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'stringTemplate' @ [175:26] ==> val stringTemplate: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'stringTemplate' @ [177:26] ==> val stringTemplate: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'startOffset' @ [177:41] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'stringTemplate' @ [178:9] ==> val stringTemplate: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'getContentRange' @ [178:24] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'equalsToRange' @ [178:42] ==> public open fun equalsToRange(p0: Int, p1: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'startOffset' @ [178:56] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'templateOffset' @ [178:70] ==> val templateOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'endOffset' @ [178:86] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'templateOffset' @ [178:98] ==> val templateOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'stringTemplate' @ [178:122] ==> val stringTemplate: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'startOffset' @ [180:24] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'entry1' @ [180:38] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'startOffset' @ [180:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'entry1' @ [181:9] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'prefixOffset' @ [181:52] ==> val prefixOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'endOffset' @ [183:24] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[ValueParameterDescriptorImpl]

'entry2' @ [183:36] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'startOffset' @ [183:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'entry2' @ [184:9] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'suffixOffset' @ [184:52] ==> val suffixOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry2' @ [184:67] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'textLength' @ [184:74] ==> public final val KtStringTemplateEntry.textLength: Int[MyPropertyDescriptor]

'entry1' @ [186:18] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'text' @ [186:25] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [186:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefixOffset' @ [186:43] ==> val prefixOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry2' @ [187:18] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'text' @ [187:25] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [187:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suffixOffset' @ [187:40] ==> val suffixOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'ExtractableSubstringInfo' @ [189:12] ==> public constructor ExtractableSubstringInfo(startEntry: KtStringTemplateEntry, endEntry: KtStringTemplateEntry, prefix: String, suffix: String, type: KotlinType? = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedClassConstructorDescriptor]

'entry1' @ [189:37] ==> val entry1: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'entry2' @ [189:45] ==> val entry2: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'prefix' @ [189:53] ==> val prefix: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'suffix' @ [189:61] ==> val suffix: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.findExpressionOrStringFragment[LocalVariableDescriptor]

'createExpression' @ [189:69] ==> public final fun createExpression(): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedSimpleFunctionDescriptor]

'?:' @ [193:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TextRange?, right: TextRange): TextRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TextRange

'elements' @ [193:13] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'singleOrNull' @ [193:22] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'extractableSubstringInfo' @ [193:56] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'contentRange' @ [193:82] ==> public final val contentRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'getTextRange' @ [193:98] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'with' @ [197:12] ==> @InlineOnly public inline fun <T, R> with(receiver: ExtractableSubstringInfo, block: ExtractableSubstringInfo.() -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractableSubstringInfo
    <R> -> KtExpression

'this' @ [197:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith[ReceiverParameterDescriptorImpl]

'KtPsiFactory' @ [198:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'replacement' @ [198:39] ==> value-parameter replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith[ValueParameterDescriptorImpl]

'startEntry' @ [199:22] ==> public final val startEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'parent' @ [199:33] ==> public final val KtStringTemplateEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiFactory' @ [201:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'createStringTemplate' @ [201:20] ==> public final fun createStringTemplate(content: String): KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'prefix' @ [201:41] ==> public final val prefix: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'entries' @ [201:49] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'singleOrNull' @ [201:57] ==> public fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.singleOrNull(): KtStringTemplateEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'let' @ [201:73] ==> @InlineOnly public inline fun <T, R> KtStringTemplateEntry.let(block: (KtStringTemplateEntry) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtStringTemplateEntry
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [201:79] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'addBefore' @ [201:86] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'it' @ [201:96] ==> value-parameter it: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startEntry' @ [201:100] ==> public final val startEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'psiFactory' @ [203:24] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'createBlockStringTemplateEntry' @ [203:35] ==> public final fun createBlockStringTemplateEntry(expression: KtExpression): KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacement' @ [203:66] ==> value-parameter replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith[ValueParameterDescriptorImpl]

'parent' @ [204:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'addBefore' @ [204:36] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'refEntry' @ [204:46] ==> val refEntry: KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'startEntry' @ [204:56] ==> public final val startEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'psiFactory' @ [206:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'createStringTemplate' @ [206:20] ==> public final fun createStringTemplate(content: String): KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'suffix' @ [206:41] ==> public final val suffix: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'entries' @ [206:49] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'singleOrNull' @ [206:57] ==> public fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.singleOrNull(): KtStringTemplateEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'let' @ [206:73] ==> @InlineOnly public inline fun <T, R> KtStringTemplateEntry.let(block: (KtStringTemplateEntry) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtStringTemplateEntry
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [206:79] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'addAfter' @ [206:86] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'it' @ [206:95] ==> value-parameter it: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'endEntry' @ [206:99] ==> public final val endEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'parent' @ [208:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'deleteChildRange' @ [208:16] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'startEntry' @ [208:33] ==> public final val startEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'endEntry' @ [208:45] ==> public final val endEntry: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'addedRefEntry' @ [210:9] ==> val addedRefEntry: KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.replaceWith.<anonymous>[LocalVariableDescriptor]

'expression' @ [210:23] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'this' @ [215:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.mustBeParenthesizedInInitializerPosition[ReceiverParameterDescriptorImpl]

'left' @ [217:9] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'mustBeParenthesizedInInitializerPosition' @ [217:15] ==> public fun KtExpression.mustBeParenthesizedInInitializerPosition(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'PsiChildRange' @ [218:12] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'left' @ [218:26] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'operationReference' @ [218:32] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'any' @ [218:52] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [218:59] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.mustBeParenthesizedInInitializerPosition.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [218:83] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.mustBeParenthesizedInInitializerPosition.<anonymous>[ValueParameterDescriptorImpl]

'textContains' @ [218:86] ==> @Contract public abstract fun textContains(p0: Char): Boolean defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'e' @ [221:55] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.isObjectOrNonInnerClass[ValueParameterDescriptorImpl]

'e' @ [221:84] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.isObjectOrNonInnerClass[ValueParameterDescriptorImpl]

'!' @ [221:100] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [221:101] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.isObjectOrNonInnerClass[ValueParameterDescriptorImpl]

'isInner' @ [221:103] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'targetSibling' @ [224:24] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'parent' @ [224:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'SmartList' @ [226:28] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'anchorCandidates' @ [227:5] ==> val anchorCandidates: SmartList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'add' @ [227:22] ==> public open fun add(element: (PsiElement..PsiElement?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'targetSibling' @ [227:26] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'targetSibling' @ [228:9] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'anchorCandidates' @ [229:9] ==> val anchorCandidates: SmartList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'add' @ [229:26] ==> public open fun add(element: (PsiElement..PsiElement?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'targetSibling' @ [229:30] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'siblings' @ [229:44] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'last' @ [229:55] ==> public inline fun <T> Sequence<PsiElement>.last(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [229:62] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'anchorCandidates' @ [232:18] ==> val anchorCandidates: SmartList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'minBy' @ [232:35] ==> public inline fun <T, R : Comparable<Int>> Iterable<(PsiElement..PsiElement?)>.minBy(selector: ((PsiElement..PsiElement?)) -> Int): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R : Comparable<R>> -> Int

'it' @ [232:43] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [232:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parentsWithSelf' @ [232:62] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [232:78] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [232:86] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [232:89] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetParent' @ [232:99] ==> val targetParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'anchor' @ [233:27] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'parent' @ [233:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'Suppress' @ [235:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'targetContainer' @ [236:13] ==> val targetContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'addBefore' @ [236:29] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [236:39] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'anchor' @ [236:52] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'apply' @ [236:66] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'targetContainer' @ [237:9] ==> val targetContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

'addBefore' @ [237:25] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [237:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [237:48] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[ValueParameterDescriptorImpl]

'createWhiteSpace' @ [237:61] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'anchor' @ [237:87] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.insertDeclaration[LocalVariableDescriptor]

