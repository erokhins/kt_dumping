'sourcePosition' @ [46:13] ==> value-parameter sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.KotlinFrameExtraVariablesProvider.isAvailable[ValueParameterDescriptorImpl]

'line' @ [46:28] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'sourcePosition' @ [47:16] ==> value-parameter sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.KotlinFrameExtraVariablesProvider.isAvailable[ValueParameterDescriptorImpl]

'file' @ [47:31] ==> public final val SourcePosition.file: PsiFile[MyPropertyDescriptor]

'fileType' @ [47:36] ==> public final val PsiFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [47:63] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'getInstance' @ [47:92] ==> public open fun getInstance(): (DebuggerSettings..DebuggerSettings?) defined in com.intellij.debugger.settings.DebuggerSettings[JavaMethodDescriptor]

'AUTO_VARIABLES_MODE' @ [47:106] ==> public final var AUTO_VARIABLES_MODE: Boolean defined in com.intellij.debugger.settings.DebuggerSettings[JavaPropertyDescriptor]

'runReadAction' @ [52:16] ==> public fun <T> runReadAction(action: () -> Set<TextWithImports>): Set<TextWithImports> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<TextWithImports>

'findAdditionalExpressions' @ [52:32] ==> private fun findAdditionalExpressions(position: SourcePosition): Set<TextWithImports> defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]

'sourcePosition' @ [52:58] ==> value-parameter sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.KotlinFrameExtraVariablesProvider.collectVariables[ValueParameterDescriptorImpl]

'position' @ [57:16] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[ValueParameterDescriptorImpl]

'line' @ [57:25] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'position' @ [58:16] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[ValueParameterDescriptorImpl]

'file' @ [58:25] ==> public final val SourcePosition.file: PsiFile[MyPropertyDescriptor]

'file' @ [60:17] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'virtualFile' @ [60:22] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'if (vFile != null) FileDocumentManager.getInstance().getDocument(vFile) else null' @ [61:15] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Document?, elseBranch: Document?): Document?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Document?

'vFile' @ [61:19] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'getInstance' @ [61:54] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [61:68] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'vFile' @ [61:80] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [62:9] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [62:24] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'lineCount' @ [62:28] ==> public final val Document.lineCount: Int[MyPropertyDescriptor]

'line' @ [62:46] ==> val line: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [62:54] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'lineCount' @ [62:58] ==> public final val Document.lineCount: Int[MyPropertyDescriptor]

'emptySet' @ [63:16] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'file' @ [66:18] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'getLineStartOffset' @ [66:23] ==> public fun PsiFile.getLineStartOffset(line: Int): Int? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'line' @ [66:42] ==> val line: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'takeIf' @ [66:49] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [66:58] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions.<anonymous>[ValueParameterDescriptorImpl]

'emptySet' @ [66:77] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'file' @ [68:16] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'findElementAt' @ [68:21] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [68:35] ==> val offset: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'getContainingElement' @ [69:29] ==> private fun getContainingElement(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.debugger in file KotlinFrameExtraVariablesProvider.kt[SimpleFunctionDescriptorImpl]

'elem' @ [69:50] ==> val elem: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'elem' @ [69:61] ==> val elem: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'emptySet' @ [69:76] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'getLineRangeForElement' @ [71:17] ==> private fun getLineRangeForElement(containingElement: PsiElement, doc: Document): TextRange defined in org.jetbrains.kotlin.idea.debugger in file KotlinFrameExtraVariablesProvider.kt[SimpleFunctionDescriptorImpl]

'containingElement' @ [71:40] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [71:59] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'max' @ [73:26] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'limit' @ [73:30] ==> val limit: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'startOffset' @ [73:36] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'line' @ [73:49] ==> val line: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'startLine' @ [74:12] ==> var startLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'limit' @ [74:28] ==> val limit: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'startOffset' @ [74:34] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'shouldSkipLine' @ [74:49] ==> private fun shouldSkipLine(file: PsiFile, doc: Document, line: Int): Boolean defined in org.jetbrains.kotlin.idea.debugger in file KotlinFrameExtraVariablesProvider.kt[SimpleFunctionDescriptorImpl]

'file' @ [74:64] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [74:70] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'startLine' @ [74:75] ==> var startLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'startLine' @ [75:9] ==> var startLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'min' @ [78:24] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'limit' @ [78:28] ==> val limit: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endOffset' @ [78:34] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'line' @ [78:45] ==> val line: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endLine' @ [79:12] ==> var endLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'limit' @ [79:26] ==> val limit: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endOffset' @ [79:32] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'shouldSkipLine' @ [79:45] ==> private fun shouldSkipLine(file: PsiFile, doc: Document, line: Int): Boolean defined in org.jetbrains.kotlin.idea.debugger in file KotlinFrameExtraVariablesProvider.kt[SimpleFunctionDescriptorImpl]

'file' @ [79:60] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'doc' @ [79:66] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endLine' @ [79:71] ==> var endLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endLine' @ [80:9] ==> var endLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'file' @ [83:23] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'getLineStartOffset' @ [83:28] ==> public fun PsiFile.getLineStartOffset(line: Int): Int? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'startLine' @ [83:47] ==> var startLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'emptySet' @ [83:68] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'file' @ [84:21] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'getLineEndOffset' @ [84:26] ==> public fun PsiFile.getLineEndOffset(line: Int): Int? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'endLine' @ [84:43] ==> var endLine: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'emptySet' @ [84:62] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'startOffset' @ [86:9] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endOffset' @ [86:24] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'emptySet' @ [86:42] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'TextRange' @ [88:21] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [88:31] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'endOffset' @ [88:44] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'lineRange' @ [89:9] ==> val lineRange: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'isEmpty' @ [89:19] ==> public final val TextRange.isEmpty: Boolean[MyPropertyDescriptor]

'emptySet' @ [89:35] ==> public fun <T> emptySet(): Set<TextWithImports> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextWithImports

'LinkedHashSet' @ [91:23] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TextWithImports

'VariablesCollector' @ [93:30] ==> public constructor VariablesCollector(myLineRange: TextRange, myExpressions: MutableSet<TextWithImports>) defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[ClassConstructorDescriptorImpl]

'lineRange' @ [93:49] ==> val lineRange: TextRange defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'expressions' @ [93:60] ==> val expressions: LinkedHashSet<TextWithImports> defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'containingElement' @ [94:5] ==> val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'accept' @ [94:23] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'variablesCollector' @ [94:30] ==> val variablesCollector: VariablesCollector defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'expressions' @ [96:12] ==> val expressions: LinkedHashSet<TextWithImports> defined in org.jetbrains.kotlin.idea.debugger.findAdditionalExpressions[LocalVariableDescriptor]

'?:' @ [100:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement?

'getParentOfType' @ [100:35] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtDeclaration..KtDeclaration?)>): KtDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtDeclaration

'element' @ [100:51] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[ValueParameterDescriptorImpl]

'java' @ [100:81] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'getParentOfType' @ [100:102] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtElement..KtElement?)>): KtElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtElement

'element' @ [100:118] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[ValueParameterDescriptorImpl]

'java' @ [100:144] ==> public val <T> KClass<KtElement>.java: Class<KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'contElement' @ [101:9] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'contElement' @ [101:38] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'isLocal' @ [101:50] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'contElement' @ [102:22] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'parent' @ [102:34] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getContainingElement' @ [103:16] ==> private fun getContainingElement(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.debugger in file KotlinFrameExtraVariablesProvider.kt[SimpleFunctionDescriptorImpl]

'parent' @ [103:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'contElement' @ [106:9] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'contElement' @ [107:16] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'bodyExpression' @ [107:28] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'contElement' @ [109:12] ==> val contElement: KtElement? defined in org.jetbrains.kotlin.idea.debugger.getContainingElement[LocalVariableDescriptor]

'containingElement' @ [113:21] ==> value-parameter containingElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.getLineRangeForElement[ValueParameterDescriptorImpl]

'textRange' @ [113:39] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'TextRange' @ [114:12] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'doc' @ [114:22] ==> value-parameter doc: Document defined in org.jetbrains.kotlin.idea.debugger.getLineRangeForElement[ValueParameterDescriptorImpl]

'getLineNumber' @ [114:26] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'elemRange' @ [114:40] ==> val elemRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.debugger.getLineRangeForElement[LocalVariableDescriptor]

'startOffset' @ [114:50] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'doc' @ [114:64] ==> value-parameter doc: Document defined in org.jetbrains.kotlin.idea.debugger.getLineRangeForElement[ValueParameterDescriptorImpl]

'getLineNumber' @ [114:68] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'elemRange' @ [114:82] ==> val elemRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.debugger.getLineRangeForElement[LocalVariableDescriptor]

'endOffset' @ [114:92] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'shiftForward' @ [118:31] ==> public open fun shiftForward(@NotNull p0: CharSequence, p1: Int, @NotNull p2: String): Int defined in com.intellij.util.text.CharArrayUtil[JavaMethodDescriptor]

'doc' @ [118:44] ==> value-parameter doc: Document defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'charsSequence' @ [118:48] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'doc' @ [118:63] ==> value-parameter doc: Document defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'getLineStartOffset' @ [118:67] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [118:86] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'doc' @ [119:15] ==> value-parameter doc: Document defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'getLineEndOffset' @ [119:19] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [119:36] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'start' @ [120:9] ==> val start: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'end' @ [120:18] ==> val end: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'file' @ [124:24] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[ValueParameterDescriptorImpl]

'findElementAt' @ [124:29] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'start' @ [124:43] ==> val start: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'getTopmostElementAtOffset' @ [125:51] ==> @NotNull public open fun getTopmostElementAtOffset(@NotNull element: PsiElement, offset: Int): PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'elemAtOffset' @ [125:77] ==> val elemAtOffset: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'start' @ [125:93] ==> val start: Int defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'topmostElementAtOffset' @ [126:12] ==> val topmostElementAtOffset: PsiElement defined in org.jetbrains.kotlin.idea.debugger.shouldSkipLine[LocalVariableDescriptor]

'KtTreeVisitorVoid' @ [132:5] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'element' @ [135:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitKtElement[ValueParameterDescriptorImpl]

'isInRange' @ [135:21] ==> private final fun KtElement.isInRange(): Boolean defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'super' @ [136:13] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [136:19] ==> public open fun visitKtElement(@NotNull p0: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'element' @ [136:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitKtElement[ValueParameterDescriptorImpl]

'expression' @ [141:13] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[ValueParameterDescriptorImpl]

'isInRange' @ [141:24] ==> private final fun KtElement.isInRange(): Boolean defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'expression' @ [142:28] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [142:39] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'selector' @ [143:17] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[LocalVariableDescriptor]

'isRefToProperty' @ [144:21] ==> private final fun isRefToProperty(expression: KtReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'selector' @ [144:37] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[LocalVariableDescriptor]

'myExpressions' @ [145:21] ==> private final val myExpressions: MutableSet<TextWithImports> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[PropertyDescriptorImpl]

'add' @ [145:35] ==> public abstract fun add(element: TextWithImports): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'expression' @ [145:39] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[ValueParameterDescriptorImpl]

'createText' @ [145:50] ==> private final fun KtElement.createText(): TextWithImports defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'super' @ [150:9] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[LazyClassReceiverParameterDescriptor]

'visitQualifiedExpression' @ [150:15] ==> public open fun visitQualifiedExpression(@NotNull p0: KtQualifiedExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [150:40] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitQualifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [154:23] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[ValueParameterDescriptorImpl]

'analyzeFully' @ [154:34] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [155:26] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [155:49] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [155:67] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[ValueParameterDescriptorImpl]

'descriptor' @ [156:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'descriptor' @ [157:26] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'getter' @ [157:37] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getter' @ [158:21] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'context' @ [158:39] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [158:62] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'getter' @ [158:96] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'descriptor' @ [159:20] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isRefToProperty[LocalVariableDescriptor]

'compileTimeInitializer' @ [159:31] ==> public final val PropertyDescriptor.compileTimeInitializer: ConstantValue<*>?[MyPropertyDescriptor]

'expression' @ [165:13] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitReferenceExpression[ValueParameterDescriptorImpl]

'isInRange' @ [165:24] ==> private final fun KtElement.isInRange(): Boolean defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'isRefToProperty' @ [166:17] ==> private final fun isRefToProperty(expression: KtReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'expression' @ [166:33] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitReferenceExpression[ValueParameterDescriptorImpl]

'myExpressions' @ [167:17] ==> private final val myExpressions: MutableSet<TextWithImports> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[PropertyDescriptorImpl]

'add' @ [167:31] ==> public abstract fun add(element: TextWithImports): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'expression' @ [167:35] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitReferenceExpression[ValueParameterDescriptorImpl]

'createText' @ [167:46] ==> private final fun KtElement.createText(): TextWithImports defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[SimpleFunctionDescriptorImpl]

'super' @ [170:9] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[LazyClassReceiverParameterDescriptor]

'visitReferenceExpression' @ [170:15] ==> public open fun visitReferenceExpression(@NotNull p0: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [170:40] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.visitReferenceExpression[ValueParameterDescriptorImpl]

'myLineRange' @ [173:50] ==> private final val myLineRange: TextRange defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector[PropertyDescriptorImpl]

'intersects' @ [173:62] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'this' @ [173:73] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.isInRange[ReceiverParameterDescriptorImpl]

'textRange' @ [173:78] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'TextWithImportsImpl' @ [174:59] ==> public constructor TextWithImportsImpl(p0: (CodeFragmentKind..CodeFragmentKind?), @NotNull p1: String) defined in com.intellij.debugger.engine.evaluation.TextWithImportsImpl[JavaClassConstructorDescriptor]

'EXPRESSION' @ [174:96] ==> enum entry EXPRESSION defined in com.intellij.debugger.engine.evaluation.CodeFragmentKind[FakeCallableDescriptorForObject]

'this' @ [174:108] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.VariablesCollector.createText[ReceiverParameterDescriptorImpl]

'text' @ [174:113] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

