'SmartEnterProcessorWithFixers.Fixer<KotlinSmartEnterHandler>' @ [26:28] ==> public constructor Fixer<P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)>() defined in com.intellij.lang.SmartEnterProcessorWithFixers.Fixer[JavaClassConstructorDescriptor]
Inferred types:
    <P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)> -> KotlinSmartEnterHandler

'psiElement' @ [28:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'editor' @ [30:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'document' @ [30:26] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'psiElement' @ [31:21] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'range' @ [31:32] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [31:38] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'psiElement' @ [32:20] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'body' @ [32:31] ==> public final val KtDoWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'psiElement' @ [34:28] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'whileKeyword' @ [34:39] ==> public final val KtDoWhileExpression.whileKeyword: PsiElement?[MyPropertyDescriptor]

'if (body == null) {
            if (whileKeyword == null) {
                doc.replaceString(start, start + "do".length, "do {} while()")
            }
            else {
                doc.insertString(start + "do".length, "{}")
            }
            return
        }
        else if (whileKeyword != null && body !is KtBlockExpression && body.startLine(doc) > psiElement.startLine(doc)) {
            doc.insertString(whileKeyword.range.start, "}")
            doc.insertString(start + "do".length, "{")

            return
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'body' @ [35:13] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'if (whileKeyword == null) {
                doc.replaceString(start, start + "do".length, "do {} while()")
            }
            else {
                doc.insertString(start + "do".length, "{}")
            }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'whileKeyword' @ [36:17] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'doc' @ [37:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'replaceString' @ [37:21] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'start' @ [37:35] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'start' @ [37:42] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'length' @ [37:55] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'doc' @ [40:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'insertString' @ [40:21] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'start' @ [40:34] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'length' @ [40:47] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'whileKeyword' @ [44:18] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'body' @ [44:42] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'body' @ [44:72] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'startLine' @ [44:77] ==> public fun PsiElement.startLine(doc: Document): Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[SimpleFunctionDescriptorImpl]

'doc' @ [44:87] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'psiElement' @ [44:94] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'startLine' @ [44:105] ==> public fun PsiElement.startLine(doc: Document): Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[SimpleFunctionDescriptorImpl]

'doc' @ [44:115] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'doc' @ [45:13] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'insertString' @ [45:17] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'whileKeyword' @ [45:30] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'range' @ [45:43] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [45:49] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'doc' @ [46:13] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'insertString' @ [46:17] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'start' @ [46:30] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'length' @ [46:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'psiElement' @ [51:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'condition' @ [51:24] ==> public final val KtDoWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'psiElement' @ [52:26] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'leftParenthesis' @ [52:37] ==> public final val KtDoWhileExpression.leftParenthesis: PsiElement?[MyPropertyDescriptor]

'psiElement' @ [53:26] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'rightParenthesis' @ [53:37] ==> public final val KtDoWhileExpression.rightParenthesis: PsiElement?[MyPropertyDescriptor]

'when {
                whileKeyword == null -> doc.insertString(psiElement.range.end, "while()")
                lParen == null && rParen == null -> {
                    doc.replaceString(whileKeyword.range.start, whileKeyword.range.end, "while()")
                }
                lParen != null -> processor.registerUnresolvedError(lParen.range.end)
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'whileKeyword' @ [56:17] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'doc' @ [56:41] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'insertString' @ [56:45] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'psiElement' @ [56:58] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'range' @ [56:69] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [56:75] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'lParen' @ [57:17] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'rParen' @ [57:35] ==> val rParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'doc' @ [58:21] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'replaceString' @ [58:25] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'whileKeyword' @ [58:39] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'range' @ [58:52] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [58:58] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'whileKeyword' @ [58:65] ==> val whileKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'range' @ [58:78] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [58:84] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'lParen' @ [60:17] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'processor' @ [60:35] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [60:45] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'lParen' @ [60:69] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinDoWhileFixer.apply[LocalVariableDescriptor]

'range' @ [60:76] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [60:82] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

