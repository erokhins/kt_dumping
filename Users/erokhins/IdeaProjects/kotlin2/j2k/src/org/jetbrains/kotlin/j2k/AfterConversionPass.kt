'if (range != null) {
            val document = kotlinFile.viewProvider.document!!
            val marker = document.createRangeMarker(range.startOffset, range.endOffset)
            marker.isGreedyToLeft = true
            marker.isGreedyToRight = true
            marker
        }
        else {
            null
        }' @ [25:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RangeMarker?, elseBranch: RangeMarker?): RangeMarker?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RangeMarker?

'range' @ [25:31] ==> value-parameter range: TextRange? defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[ValueParameterDescriptorImpl]

'kotlinFile' @ [26:28] ==> value-parameter kotlinFile: KtFile defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[ValueParameterDescriptorImpl]

'viewProvider' @ [26:39] ==> public final val KtFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'document' @ [26:52] ==> public final val FileViewProvider.document: Document?[MyPropertyDescriptor]

'document' @ [27:26] ==> val document: Document defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[LocalVariableDescriptor]

'createRangeMarker' @ [27:35] ==> @NotNull public open fun createRangeMarker(p0: Int, p1: Int): RangeMarker defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'range' @ [27:53] ==> value-parameter range: TextRange? defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[ValueParameterDescriptorImpl]

'startOffset' @ [27:59] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [27:72] ==> value-parameter range: TextRange? defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[ValueParameterDescriptorImpl]

'endOffset' @ [27:78] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'marker' @ [28:13] ==> val marker: RangeMarker defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[LocalVariableDescriptor]

'isGreedyToLeft' @ [28:20] ==> public final var RangeMarker.isGreedyToLeft: Boolean[MyPropertyDescriptor]

'marker' @ [29:13] ==> val marker: RangeMarker defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[LocalVariableDescriptor]

'isGreedyToRight' @ [29:20] ==> public final var RangeMarker.isGreedyToRight: Boolean[MyPropertyDescriptor]

'marker' @ [30:13] ==> val marker: RangeMarker defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[LocalVariableDescriptor]

'postProcessor' @ [36:9] ==> public final val postProcessor: PostProcessor defined in org.jetbrains.kotlin.j2k.AfterConversionPass[PropertyDescriptorImpl]

'doAdditionalProcessing' @ [36:23] ==> public abstract fun doAdditionalProcessing(file: KtFile, rangeMarker: RangeMarker?): Unit defined in org.jetbrains.kotlin.j2k.PostProcessor[SimpleFunctionDescriptorImpl]

'kotlinFile' @ [36:46] ==> value-parameter kotlinFile: KtFile defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[ValueParameterDescriptorImpl]

'rangeMarker' @ [36:58] ==> val rangeMarker: RangeMarker? defined in org.jetbrains.kotlin.j2k.AfterConversionPass.run[LocalVariableDescriptor]

