'SmartEnterProcessorWithFixers.Fixer<KotlinSmartEnterHandler>' @ [26:39] ==> public constructor Fixer<P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)>() defined in com.intellij.lang.SmartEnterProcessorWithFixers.Fixer[JavaClassConstructorDescriptor]
Inferred types:
    <P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)> -> KotlinSmartEnterHandler

'psiElement' @ [28:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'psiElement' @ [30:29] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'valueParameterList' @ [30:40] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'if (parameterList == null) {
            val identifier = psiElement.nameIdentifier ?: return

            // Insert () after name or after type parameters list when it placed after name
            val offset = Math.max(identifier.range.end, psiElement.typeParameterList?.range?.end ?: psiElement.range.start)
            editor.document.insertString(offset, "()")
            processor.registerUnresolvedError(offset + 1)
        }
        else {
            val rParen = parameterList.lastChild ?: return

            if (")" != rParen.text) {
                val params = parameterList.parameters
                val offset = if (params.isEmpty()) parameterList.range.start + 1 else params.last().range.end
                editor.document.insertString(offset, ")")
            }
        }' @ [31:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameterList' @ [31:13] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'psiElement' @ [32:30] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'nameIdentifier' @ [32:41] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'max' @ [35:31] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'identifier' @ [35:35] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'range' @ [35:46] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [35:52] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'psiElement' @ [35:57] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'typeParameterList' @ [35:68] ==> public final val KtNamedFunction.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'range' @ [35:87] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [35:94] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'psiElement' @ [35:101] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'range' @ [35:112] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [35:118] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'editor' @ [36:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'document' @ [36:20] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'insertString' @ [36:29] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [36:42] ==> val offset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'processor' @ [37:13] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [37:23] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'offset' @ [37:47] ==> val offset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'parameterList' @ [40:26] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'lastChild' @ [40:40] ==> public final val KtParameterList.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!=' @ [42:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'rParen' @ [42:24] ==> val rParen: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'text' @ [42:31] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'parameterList' @ [43:30] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'parameters' @ [43:44] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'if (params.isEmpty()) parameterList.range.start + 1 else params.last().range.end' @ [44:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'params' @ [44:34] ==> val params: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'isEmpty' @ [44:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameterList' @ [44:52] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'range' @ [44:66] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'start' @ [44:72] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'params' @ [44:87] ==> val params: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

'last' @ [44:94] ==> public fun <T> List<(KtParameter..KtParameter?)>.last(): (KtParameter..KtParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'range' @ [44:101] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'end' @ [44:107] ==> public val TextRange.end: Int defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'editor' @ [45:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[ValueParameterDescriptorImpl]

'document' @ [45:24] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'insertString' @ [45:33] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [45:46] ==> val offset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinFunctionParametersFixer.apply[LocalVariableDescriptor]

