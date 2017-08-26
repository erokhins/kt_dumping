'Throws' @ [46:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IntroduceRefactoringException' @ [46:9] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'selectElement' @ [52:5] ==> @Throws public fun selectElement(editor: Editor, file: KtFile, failOnEmptySuggestion: Boolean, elementKinds: Collection<CodeInsightUtils.ElementKind>, callback: (PsiElement?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'editor' @ [52:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'file' @ [52:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'elementKinds' @ [52:39] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'callback' @ [52:53] ==> value-parameter callback: (PsiElement?) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'Throws' @ [54:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IntroduceRefactoringException' @ [54:9] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'if (editor.selectionModel.hasSelection()) {
        var selectionStart = editor.selectionModel.selectionStart
        var selectionEnd = editor.selectionModel.selectionEnd

        var firstElement: PsiElement = file.findElementAt(selectionStart)!!
        var lastElement: PsiElement = file.findElementAt(selectionEnd - 1)!!

        if (PsiTreeUtil.getParentOfType(firstElement, KtLiteralStringTemplateEntry::class.java, KtEscapeStringTemplateEntry::class.java) == null
            && PsiTreeUtil.getParentOfType(lastElement, KtLiteralStringTemplateEntry::class.java, KtEscapeStringTemplateEntry::class.java) == null) {
            firstElement = firstElement.getNextSiblingIgnoringWhitespaceAndComments(true)!!
            lastElement = lastElement.getPrevSiblingIgnoringWhitespaceAndComments(true)!!
            selectionStart = firstElement.textRange.startOffset
            selectionEnd = lastElement.textRange.endOffset
        }

        val element = elementKinds.asSequence()
                .mapNotNull { findElement(file, selectionStart, selectionEnd, failOnEmptySuggestion, it) }
                .firstOrNull()
        callback(element)
    }
    else {
        val offset = editor.caretModel.offset
        smartSelectElement(editor, file, offset, failOnEmptySuggestion, elementKinds, callback)
    }' @ [60:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'editor' @ [60:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'selectionModel' @ [60:16] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'hasSelection' @ [60:31] ==> public abstract fun hasSelection(): Boolean defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'editor' @ [61:30] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'selectionModel' @ [61:37] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionStart' @ [61:52] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'editor' @ [62:28] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'selectionModel' @ [62:35] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionEnd' @ [62:50] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'file' @ [64:40] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'findElementAt' @ [64:45] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'selectionStart' @ [64:59] ==> var selectionStart: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'file' @ [65:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'findElementAt' @ [65:44] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'selectionEnd' @ [65:58] ==> var selectionEnd: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'==' @ [67:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtStringTemplateEntry[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [67:25] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtStringTemplateEntry..KtStringTemplateEntry?)>..Class<out (KtStringTemplateEntry..KtStringTemplateEntry?)>?)): KtStringTemplateEntry? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateEntry

'firstElement' @ [67:41] ==> var firstElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'KtLiteralStringTemplateEntry' @ [67:55] ==> public constructor KtLiteralStringTemplateEntry(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtLiteralStringTemplateEntry[JavaClassConstructorDescriptor]

'java' @ [67:91] ==> public val <T> KClass<KtLiteralStringTemplateEntry>.java: Class<KtLiteralStringTemplateEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLiteralStringTemplateEntry

'KtEscapeStringTemplateEntry' @ [67:97] ==> public constructor KtEscapeStringTemplateEntry(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtEscapeStringTemplateEntry[JavaClassConstructorDescriptor]

'java' @ [67:132] ==> public val <T> KClass<KtEscapeStringTemplateEntry>.java: Class<KtEscapeStringTemplateEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtEscapeStringTemplateEntry

'==' @ [68:16] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtStringTemplateEntry[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [68:28] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtStringTemplateEntry..KtStringTemplateEntry?)>..Class<out (KtStringTemplateEntry..KtStringTemplateEntry?)>?)): KtStringTemplateEntry? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateEntry

'lastElement' @ [68:44] ==> var lastElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'KtLiteralStringTemplateEntry' @ [68:57] ==> public constructor KtLiteralStringTemplateEntry(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtLiteralStringTemplateEntry[JavaClassConstructorDescriptor]

'java' @ [68:93] ==> public val <T> KClass<KtLiteralStringTemplateEntry>.java: Class<KtLiteralStringTemplateEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLiteralStringTemplateEntry

'KtEscapeStringTemplateEntry' @ [68:99] ==> public constructor KtEscapeStringTemplateEntry(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtEscapeStringTemplateEntry[JavaClassConstructorDescriptor]

'java' @ [68:134] ==> public val <T> KClass<KtEscapeStringTemplateEntry>.java: Class<KtEscapeStringTemplateEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtEscapeStringTemplateEntry

'firstElement' @ [69:13] ==> var firstElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'firstElement' @ [69:28] ==> var firstElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'getNextSiblingIgnoringWhitespaceAndComments' @ [69:41] ==> public fun PsiElement.getNextSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'lastElement' @ [70:13] ==> var lastElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'lastElement' @ [70:27] ==> var lastElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'getPrevSiblingIgnoringWhitespaceAndComments' @ [70:39] ==> public fun PsiElement.getPrevSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'selectionStart' @ [71:13] ==> var selectionStart: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'firstElement' @ [71:30] ==> var firstElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'textRange' @ [71:43] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [71:53] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'selectionEnd' @ [72:13] ==> var selectionEnd: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'lastElement' @ [72:28] ==> var lastElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'textRange' @ [72:40] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [72:50] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'elementKinds' @ [75:23] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'asSequence' @ [75:36] ==> public fun <T> Iterable<CodeInsightUtils.ElementKind>.asSequence(): Sequence<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'mapNotNull' @ [76:18] ==> public fun <T, R : Any> Sequence<CodeInsightUtils.ElementKind>.mapNotNull(transform: (CodeInsightUtils.ElementKind) -> PsiElement?): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind
    <R : Any> -> PsiElement

'findElement' @ [76:31] ==> @Throws private fun findElement(file: KtFile, startOffset: Int, endOffset: Int, failOnNoExpression: Boolean, elementKind: CodeInsightUtils.ElementKind): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring in file elementSelectionUtils.kt[SimpleFunctionDescriptorImpl]

'file' @ [76:43] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'selectionStart' @ [76:49] ==> var selectionStart: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'selectionEnd' @ [76:65] ==> var selectionEnd: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'failOnEmptySuggestion' @ [76:79] ==> value-parameter failOnEmptySuggestion: Boolean defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'it' @ [76:102] ==> value-parameter it: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.selectElement.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [77:18] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'invoke' @ [78:9] ==> public abstract operator fun invoke(p1: PsiElement?): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [78:18] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'editor' @ [81:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'caretModel' @ [81:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [81:40] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'smartSelectElement' @ [82:9] ==> @Throws private fun smartSelectElement(editor: Editor, file: PsiFile, offset: Int, failOnEmptySuggestion: Boolean, elementKinds: Collection<CodeInsightUtils.ElementKind>, callback: (PsiElement?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'editor' @ [82:28] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'file' @ [82:36] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'offset' @ [82:42] ==> val offset: Int defined in org.jetbrains.kotlin.idea.refactoring.selectElement[LocalVariableDescriptor]

'failOnEmptySuggestion' @ [82:50] ==> value-parameter failOnEmptySuggestion: Boolean defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'elementKinds' @ [82:73] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'callback' @ [82:87] ==> value-parameter callback: (PsiElement?) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.selectElement[ValueParameterDescriptorImpl]

'Throws' @ [86:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IntroduceRefactoringException' @ [86:9] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'offset' @ [92:9] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'emptyList' @ [92:28] ==> public fun <T> emptyList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'file' @ [94:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'findElementAt' @ [94:37] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [94:51] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'emptyList' @ [94:69] ==> public fun <T> emptyList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [96:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'getSmartSelectSuggestions' @ [96:42] ==> @Throws public fun getSmartSelectSuggestions(file: PsiFile, offset: Int, elementKind: CodeInsightUtils.ElementKind): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'file' @ [96:68] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'offset' @ [96:74] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'elementKind' @ [96:86] ==> value-parameter elementKind: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'ArrayList' @ [98:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'element' @ [99:12] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'!' @ [99:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [99:33] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [99:65] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [99:73] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [100:12] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [101:15] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'if (element is KtTypeElement) {
            addElement =
                    elementKind == CodeInsightUtils.ElementKind.TYPE_ELEMENT
                    && element.getParentOfTypeAndBranch<KtUserType>(true) { qualifier } == null
            if (!addElement) {
                keepPrevious = false
            }
        }
        else if (element is KtExpression && element !is KtStatementExpression) {
            addElement = elementKind == CodeInsightUtils.ElementKind.EXPRESSION

            if (addElement) {
                if (element is KtParenthesizedExpression) {
                    addElement = false
                }
                else if (KtPsiUtil.isLabelIdentifierExpression(element)) {
                    addElement = false
                }
                else if (element.parent is KtQualifiedExpression) {
                    val qualifiedExpression = element.parent as KtQualifiedExpression
                    if (qualifiedExpression.receiverExpression !== element) {
                        addElement = false
                    }
                }
                else if (element.parent is KtCallElement
                         || element.parent is KtThisExpression
                         || PsiTreeUtil.getParentOfType(element, KtSuperExpression::class.java) != null) {
                    addElement = false
                }
                else if (element.parent is KtOperationExpression) {
                    val operationExpression = element.parent as KtOperationExpression
                    if (operationExpression.operationReference === element) {
                        addElement = false
                    }
                }
                if (addElement) {
                    val bindingContext = element.analyze(BodyResolveMode.FULL)
                    val expressionType = bindingContext.getType(element)
                    if (expressionType == null || KotlinBuiltIns.isUnit(expressionType)) {
                        addElement = false
                    }
                }
            }
        }' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [105:13] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [106:13] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'elementKind' @ [107:21] ==> value-parameter elementKind: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'TYPE_ELEMENT' @ [107:65] ==> enum entry TYPE_ELEMENT defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'element' @ [108:24] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [108:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'qualifier' @ [108:77] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'!' @ [109:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'addElement' @ [109:18] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'keepPrevious' @ [110:17] ==> var keepPrevious: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [113:18] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [113:45] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [114:13] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'elementKind' @ [114:26] ==> value-parameter elementKind: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[ValueParameterDescriptorImpl]

'EXPRESSION' @ [114:70] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'addElement' @ [116:17] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'if (element is KtParenthesizedExpression) {
                    addElement = false
                }
                else if (KtPsiUtil.isLabelIdentifierExpression(element)) {
                    addElement = false
                }
                else if (element.parent is KtQualifiedExpression) {
                    val qualifiedExpression = element.parent as KtQualifiedExpression
                    if (qualifiedExpression.receiverExpression !== element) {
                        addElement = false
                    }
                }
                else if (element.parent is KtCallElement
                         || element.parent is KtThisExpression
                         || PsiTreeUtil.getParentOfType(element, KtSuperExpression::class.java) != null) {
                    addElement = false
                }
                else if (element.parent is KtOperationExpression) {
                    val operationExpression = element.parent as KtOperationExpression
                    if (operationExpression.operationReference === element) {
                        addElement = false
                    }
                }' @ [117:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [117:21] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [118:21] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'if (KtPsiUtil.isLabelIdentifierExpression(element)) {
                    addElement = false
                }
                else if (element.parent is KtQualifiedExpression) {
                    val qualifiedExpression = element.parent as KtQualifiedExpression
                    if (qualifiedExpression.receiverExpression !== element) {
                        addElement = false
                    }
                }
                else if (element.parent is KtCallElement
                         || element.parent is KtThisExpression
                         || PsiTreeUtil.getParentOfType(element, KtSuperExpression::class.java) != null) {
                    addElement = false
                }
                else if (element.parent is KtOperationExpression) {
                    val operationExpression = element.parent as KtOperationExpression
                    if (operationExpression.operationReference === element) {
                        addElement = false
                    }
                }' @ [120:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isLabelIdentifierExpression' @ [120:36] ==> public open fun isLabelIdentifierExpression(p0: (PsiElement..PsiElement?)): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [120:64] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [121:21] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'if (element.parent is KtQualifiedExpression) {
                    val qualifiedExpression = element.parent as KtQualifiedExpression
                    if (qualifiedExpression.receiverExpression !== element) {
                        addElement = false
                    }
                }
                else if (element.parent is KtCallElement
                         || element.parent is KtThisExpression
                         || PsiTreeUtil.getParentOfType(element, KtSuperExpression::class.java) != null) {
                    addElement = false
                }
                else if (element.parent is KtOperationExpression) {
                    val operationExpression = element.parent as KtOperationExpression
                    if (operationExpression.operationReference === element) {
                        addElement = false
                    }
                }' @ [123:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [123:26] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [123:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [124:47] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [124:55] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'qualifiedExpression' @ [125:25] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'receiverExpression' @ [125:45] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [125:68] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [126:25] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'if (element.parent is KtCallElement
                         || element.parent is KtThisExpression
                         || PsiTreeUtil.getParentOfType(element, KtSuperExpression::class.java) != null) {
                    addElement = false
                }
                else if (element.parent is KtOperationExpression) {
                    val operationExpression = element.parent as KtOperationExpression
                    if (operationExpression.operationReference === element) {
                        addElement = false
                    }
                }' @ [129:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [129:26] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [129:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [130:29] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [130:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!=' @ [131:29] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtSuperExpression[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [131:41] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtSuperExpression..KtSuperExpression?)>): KtSuperExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtSuperExpression

'element' @ [131:57] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'KtSuperExpression' @ [131:66] ==> public constructor KtSuperExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtSuperExpression[JavaClassConstructorDescriptor]

'java' @ [131:91] ==> public val <T> KClass<KtSuperExpression>.java: Class<KtSuperExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSuperExpression

'addElement' @ [132:21] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [134:26] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [134:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [135:47] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [135:55] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'operationExpression' @ [136:25] ==> val operationExpression: KtOperationExpression defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'operationReference' @ [136:45] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'element' @ [136:68] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [137:25] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [140:21] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [141:42] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'analyze' @ [141:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [141:74] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [142:42] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'getType' @ [142:57] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [142:65] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'expressionType' @ [143:25] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'isUnit' @ [143:66] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expressionType' @ [143:73] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [144:25] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'addElement' @ [150:13] ==> var addElement: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'elements' @ [151:13] ==> val elements: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'add' @ [151:22] ==> public open fun add(element: KtElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [151:26] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'!' @ [154:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'keepPrevious' @ [154:14] ==> var keepPrevious: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'elements' @ [155:13] ==> val elements: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'clear' @ [155:22] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [158:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'element' @ [158:19] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'parent' @ [158:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'elements' @ [160:12] ==> val elements: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.getSmartSelectSuggestions[LocalVariableDescriptor]

'Throws' @ [163:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IntroduceRefactoringException' @ [163:9] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'elementKinds' @ [172:20] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'flatMap' @ [172:33] ==> public inline fun <T, R> Iterable<CodeInsightUtils.ElementKind>.flatMap(transform: (CodeInsightUtils.ElementKind) -> Iterable<KtElement>): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind
    <R> -> KtElement

'getSmartSelectSuggestions' @ [172:43] ==> @Throws public fun getSmartSelectSuggestions(file: PsiFile, offset: Int, elementKind: CodeInsightUtils.ElementKind): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'file' @ [172:69] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'offset' @ [172:75] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'it' @ [172:83] ==> value-parameter it: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [173:9] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'isEmpty' @ [173:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'failOnEmptySuggestion' @ [174:13] ==> value-parameter failOnEmptySuggestion: Boolean defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'IntroduceRefactoringException' @ [174:42] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'message' @ [174:96] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'invoke' @ [175:9] ==> public abstract operator fun invoke(p1: PsiElement?): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'elements' @ [179:9] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'size' @ [179:18] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getApplication' @ [179:50] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [179:67] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'invoke' @ [180:9] ==> public abstract operator fun invoke(p1: PsiElement?): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'elements' @ [180:18] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'first' @ [180:27] ==> public fun <T> List<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'DefaultListModel' @ [184:17] ==> public constructor DefaultListModel<E : (Any..Any?)>() defined in javax.swing.DefaultListModel[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'elements' @ [185:5] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'forEach' @ [185:14] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'model' @ [185:24] ==> val model: DefaultListModel<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'addElement' @ [185:30] ==> public open fun addElement(p0: (PsiElement..PsiElement?)): Unit defined in javax.swing.DefaultListModel[JavaMethodDescriptor]

'it' @ [185:41] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[ValueParameterDescriptorImpl]

'ScopeHighlighter' @ [187:23] ==> public constructor ScopeHighlighter(@NotNull p0: Editor) defined in com.intellij.codeInsight.unwrap.ScopeHighlighter[JavaClassConstructorDescriptor]

'editor' @ [187:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'JBList' @ [189:16] ==> public constructor JBList<E : (Any..Any?)>(@NotNull p0: ListModel<(PsiElement..PsiElement?)>) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'model' @ [189:35] ==> val model: DefaultListModel<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'list' @ [191:5] ==> val list: JBList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'cellRenderer' @ [191:10] ==> public final var <E : (Any..Any?)> JBList<PsiElement>.cellRenderer: (ListCellRenderer<in (PsiElement..PsiElement?)>..ListCellRenderer<in (PsiElement..PsiElement?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'DefaultListCellRenderer' @ [191:34] ==> public constructor DefaultListCellRenderer() defined in javax.swing.DefaultListCellRenderer[JavaClassConstructorDescriptor]

'super' @ [193:37] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>[LazyClassReceiverParameterDescriptor]

'getListCellRendererComponent' @ [193:43] ==> public open fun getListCellRendererComponent(p0: (JList<*>..JList<*>?), p1: (Any..Any?), p2: Int, p3: Boolean, p4: Boolean): (Component..Component?) defined in javax.swing.DefaultListCellRenderer[JavaMethodDescriptor]

'list' @ [193:72] ==> value-parameter list: JList<*> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'value' @ [193:78] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'index' @ [193:85] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'isSelected' @ [193:92] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'cellHasFocus' @ [193:104] ==> value-parameter cellHasFocus: Boolean defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'value' @ [194:27] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[ValueParameterDescriptorImpl]

'element' @ [195:17] ==> val element: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[LocalVariableDescriptor]

'isValid' @ [195:27] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'text' @ [196:17] ==> public final var <no name provided>.text: (String..String?)[MyPropertyDescriptor]

'getExpressionShortText' @ [196:24] ==> public fun getExpressionShortText(element: KtElement): String defined in org.jetbrains.kotlin.idea.refactoring in file elementSelectionUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [196:47] ==> val element: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[LocalVariableDescriptor]

'rendererComponent' @ [198:20] ==> val rendererComponent: (Component..Component?) defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<no name provided>.getListCellRendererComponent[LocalVariableDescriptor]

'list' @ [202:5] ==> val list: JBList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'addListSelectionListener' @ [202:10] ==> public final fun addListSelectionListener(p0: (((ListSelectionEvent..ListSelectionEvent?)) -> Unit..(((ListSelectionEvent..ListSelectionEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.components.JBList[MyFunctionDescriptor]

'highlighter' @ [203:9] ==> val highlighter: ScopeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'dropHighlight' @ [203:21] ==> public open fun dropHighlight(): Unit defined in com.intellij.codeInsight.unwrap.ScopeHighlighter[JavaMethodDescriptor]

'list' @ [204:29] ==> val list: JBList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'selectedIndex' @ [204:34] ==> public final var <E : (Any..Any?)> JBList<PsiElement>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'selectedIndex' @ [205:13] ==> val selectedIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [206:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'toExtract' @ [207:9] ==> val toExtract: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[LocalVariableDescriptor]

'add' @ [207:19] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'model' @ [207:23] ==> val model: DefaultListModel<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'get' @ [207:29] ==> public open operator fun get(p0: Int): (PsiElement..PsiElement?) defined in javax.swing.DefaultListModel[JavaMethodDescriptor]

'selectedIndex' @ [207:33] ==> val selectedIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[LocalVariableDescriptor]

'highlighter' @ [208:9] ==> val highlighter: ScopeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'highlight' @ [208:21] ==> public open fun highlight(@NotNull p0: PsiElement, @NotNull p1: (MutableList<(PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): Unit defined in com.intellij.codeInsight.unwrap.ScopeHighlighter[JavaMethodDescriptor]

'model' @ [208:31] ==> val model: DefaultListModel<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'get' @ [208:37] ==> public open operator fun get(p0: Int): (PsiElement..PsiElement?) defined in javax.swing.DefaultListModel[JavaMethodDescriptor]

'selectedIndex' @ [208:41] ==> val selectedIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[LocalVariableDescriptor]

'toExtract' @ [208:57] ==> val toExtract: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement.<anonymous>[LocalVariableDescriptor]

'elementKinds' @ [212:9] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'size' @ [212:22] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'when (elementKinds.iterator().next()) {
            CodeInsightUtils.ElementKind.EXPRESSION -> title = "Expressions"
            CodeInsightUtils.ElementKind.TYPE_ELEMENT, CodeInsightUtils.ElementKind.TYPE_CONSTRUCTOR -> title = "Types"
        }' @ [213:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'elementKinds' @ [213:15] ==> value-parameter elementKinds: Collection<CodeInsightUtils.ElementKind> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'iterator' @ [213:28] ==> public abstract fun iterator(): Iterator<CodeInsightUtils.ElementKind> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'next' @ [213:39] ==> public abstract operator fun next(): CodeInsightUtils.ElementKind defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'EXPRESSION' @ [214:42] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'title' @ [214:56] ==> var title: String defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'TYPE_ELEMENT' @ [215:42] ==> enum entry TYPE_ELEMENT defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'TYPE_CONSTRUCTOR' @ [215:85] ==> enum entry TYPE_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'title' @ [215:105] ==> var title: String defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'getInstance' @ [219:20] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopupBuilder' @ [220:14] ==> @NotNull public open fun createListPopupBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'list' @ [220:37] ==> val list: JBList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'setTitle' @ [221:14] ==> @NotNull public open fun setTitle(@NotNull @Nls p0: String): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'title' @ [221:23] ==> var title: String defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'setMovable' @ [222:14] ==> public open fun setMovable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setResizable' @ [223:14] ==> public open fun setResizable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setRequestFocus' @ [224:14] ==> public open fun setRequestFocus(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setItemChoosenCallback' @ [225:14] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'invoke' @ [225:39] ==> public abstract operator fun invoke(p1: PsiElement?): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'list' @ [225:48] ==> val list: JBList<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'selectedValue' @ [225:53] ==> public final val <E : (Any..Any?)> JBList<PsiElement>.selectedValue: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'addListener' @ [226:14] ==> public open fun addListener(p0: (JBPopupListener..JBPopupListener?)): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'JBPopupAdapter' @ [227:30] ==> public constructor JBPopupAdapter() defined in com.intellij.openapi.ui.popup.JBPopupAdapter[JavaClassConstructorDescriptor]

'highlighter' @ [229:29] ==> val highlighter: ScopeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[LocalVariableDescriptor]

'dropHighlight' @ [229:41] ==> public open fun dropHighlight(): Unit defined in com.intellij.codeInsight.unwrap.ScopeHighlighter[JavaMethodDescriptor]

'createPopup' @ [233:14] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'showInBestPositionFor' @ [234:14] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'editor' @ [234:36] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.smartSelectElement[ValueParameterDescriptorImpl]

'element' @ [238:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[ValueParameterDescriptorImpl]

'renderTrimmed' @ [238:24] ==> public fun KtElement.renderTrimmed(): String defined in org.jetbrains.kotlin.idea.refactoring in file elementRenderingUtils.kt[SimpleFunctionDescriptorImpl]

'text' @ [239:27] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'indexOf' @ [239:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [240:23] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'substring' @ [240:28] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (firstNewLinePos != -1) firstNewLinePos else Math.min(100, text.length)' @ [240:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'firstNewLinePos' @ [240:45] ==> val firstNewLinePos: Int defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'-' @ [240:64] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'firstNewLinePos' @ [240:68] ==> val firstNewLinePos: Int defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'min' @ [240:94] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'text' @ [240:103] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'length' @ [240:108] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'trimmedText' @ [241:9] ==> var trimmedText: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'length' @ [241:21] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'text' @ [241:31] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'length' @ [241:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'trimmedText' @ [241:44] ==> var trimmedText: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'trimmedText' @ [242:12] ==> var trimmedText: String defined in org.jetbrains.kotlin.idea.refactoring.getExpressionShortText[LocalVariableDescriptor]

'Throws' @ [245:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IntroduceRefactoringException' @ [245:9] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'findElement' @ [253:36] ==> @Nullable public open fun findElement(@NotNull file: PsiFile, startOffset: Int, endOffset: Int, @NotNull elementKind: CodeInsightUtils.ElementKind): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'file' @ [253:48] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'startOffset' @ [253:54] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'endOffset' @ [253:67] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'elementKind' @ [253:78] ==> value-parameter elementKind: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'element' @ [254:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.findElement[LocalVariableDescriptor]

'elementKind' @ [254:28] ==> value-parameter elementKind: CodeInsightUtils.ElementKind defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'EXPRESSION' @ [254:72] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'element' @ [255:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.findElement[LocalVariableDescriptor]

'findExpressionOrStringFragment' @ [255:19] ==> public fun findExpressionOrStringFragment(file: KtFile, startOffset: Int, endOffset: Int): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [255:50] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'startOffset' @ [255:56] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'endOffset' @ [255:69] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'element' @ [257:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.findElement[LocalVariableDescriptor]

'failOnNoExpression' @ [260:13] ==> value-parameter failOnNoExpression: Boolean defined in org.jetbrains.kotlin.idea.refactoring.findElement[ValueParameterDescriptorImpl]

'IntroduceRefactoringException' @ [261:19] ==> public constructor IntroduceRefactoringException(message: String) defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[ClassConstructorDescriptorImpl]

'message' @ [261:73] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'element' @ [265:12] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.findElement[LocalVariableDescriptor]

'RuntimeException' @ [268:56] ==> public constructor RuntimeException(p0: (String..String?)) defined in java.lang.RuntimeException[JavaClassConstructorDescriptor]

'message' @ [268:73] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException.<init>[ValueParameterDescriptorImpl]

