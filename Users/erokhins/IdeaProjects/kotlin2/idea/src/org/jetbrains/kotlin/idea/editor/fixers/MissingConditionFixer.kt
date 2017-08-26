'SmartEnterProcessorWithFixers.Fixer<KotlinSmartEnterHandler>' @ [24:55] ==> public constructor Fixer<P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)>() defined in com.intellij.lang.SmartEnterProcessorWithFixers.Fixer[JavaClassConstructorDescriptor]
Inferred types:
    <P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)> -> KotlinSmartEnterHandler

'getElement' @ [26:27] ==> public abstract fun getElement(element: PsiElement?): T? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[SimpleFunctionDescriptorImpl]

'element' @ [26:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[ValueParameterDescriptorImpl]

'editor' @ [28:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[ValueParameterDescriptorImpl]

'document' @ [28:26] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getLeftParenthesis' @ [29:22] ==> public abstract fun getLeftParenthesis(element: T): PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[SimpleFunctionDescriptorImpl]

'workElement' @ [29:41] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'getRightParenthesis' @ [30:22] ==> public abstract fun getRightParenthesis(element: T): PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[SimpleFunctionDescriptorImpl]

'workElement' @ [30:42] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'getCondition' @ [31:25] ==> public abstract fun getCondition(element: T): PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[SimpleFunctionDescriptorImpl]

'workElement' @ [31:38] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'if (condition == null) {
            if (lParen == null || rParen == null) {
                var stopOffset = doc.getLineEndOffset(doc.getLineNumber(workElement.range.start))
                val then = getBody(workElement)
                if (then != null) {
                    stopOffset = Math.min(stopOffset, then.range.start)
                }

                stopOffset = Math.min(stopOffset, workElement.range.end)

                doc.replaceString(workElement.range.start, stopOffset, "$keyword ()")
                processor.registerUnresolvedError(workElement.range.start + "$keyword (".length)
            }
            else {
                processor.registerUnresolvedError(lParen.range.end)
            }
        }
        else {
            if (rParen == null) {
                doc.insertString(condition.range.end, ")")
            }
        }' @ [33:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'condition' @ [33:13] ==> val condition: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'if (lParen == null || rParen == null) {
                var stopOffset = doc.getLineEndOffset(doc.getLineNumber(workElement.range.start))
                val then = getBody(workElement)
                if (then != null) {
                    stopOffset = Math.min(stopOffset, then.range.start)
                }

                stopOffset = Math.min(stopOffset, workElement.range.end)

                doc.replaceString(workElement.range.start, stopOffset, "$keyword ()")
                processor.registerUnresolvedError(workElement.range.start + "$keyword (".length)
            }
            else {
                processor.registerUnresolvedError(lParen.range.end)
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'lParen' @ [34:17] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'rParen' @ [34:35] ==> val rParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'doc' @ [35:34] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'getLineEndOffset' @ [35:38] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'doc' @ [35:55] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'getLineNumber' @ [35:59] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'workElement' @ [35:73] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [35:85] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [35:91] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'getBody' @ [36:28] ==> public abstract fun getBody(element: T): PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[SimpleFunctionDescriptorImpl]

'workElement' @ [36:36] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'then' @ [37:21] ==> val then: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'stopOffset' @ [38:21] ==> var stopOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'min' @ [38:39] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'stopOffset' @ [38:43] ==> var stopOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'then' @ [38:55] ==> val then: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [38:60] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [38:66] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'stopOffset' @ [41:17] ==> var stopOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'min' @ [41:35] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'stopOffset' @ [41:39] ==> var stopOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'workElement' @ [41:51] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [41:63] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [41:69] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'doc' @ [43:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'replaceString' @ [43:21] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'workElement' @ [43:35] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [43:47] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [43:53] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'stopOffset' @ [43:60] ==> var stopOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'keyword' @ [43:74] ==> public abstract val keyword: String defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[PropertyDescriptorImpl]

'processor' @ [44:17] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [44:27] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'workElement' @ [44:51] ==> val workElement: T defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [44:63] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [44:69] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'keyword' @ [44:79] ==> public abstract val keyword: String defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer[PropertyDescriptorImpl]

'length' @ [44:90] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'processor' @ [47:17] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [47:27] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'lParen' @ [47:51] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [47:58] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [47:64] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'rParen' @ [51:17] ==> val rParen: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'doc' @ [52:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'insertString' @ [52:21] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'condition' @ [52:34] ==> val condition: PsiElement? defined in org.jetbrains.kotlin.idea.editor.fixers.MissingConditionFixer.apply[LocalVariableDescriptor]

'range' @ [52:44] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [52:50] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

