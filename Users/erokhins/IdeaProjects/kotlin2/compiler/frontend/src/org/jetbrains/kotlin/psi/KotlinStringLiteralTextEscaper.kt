'LiteralTextEscaper<KtStringTemplateExpression>' @ [25:73] ==> protected/*protected and package*/ constructor LiteralTextEscaper<T : (PsiLanguageInjectionHost..PsiLanguageInjectionHost?)>(@NotNull p0: KtStringTemplateExpression) defined in com.intellij.psi.LiteralTextEscaper[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiLanguageInjectionHost..PsiLanguageInjectionHost?)> -> KtStringTemplateExpression

'host' @ [25:120] ==> value-parameter host: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.<init>[ValueParameterDescriptorImpl]

'TIntArrayList' @ [29:33] ==> public constructor TIntArrayList() defined in gnu.trove.TIntArrayList[JavaClassConstructorDescriptor]

'myHost' @ [32:23] ==> protected/*protected and package*/ final val myHost: (KtStringTemplateExpression..KtStringTemplateExpression?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper[JavaPropertyDescriptor]

'entries' @ [32:30] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'from' @ [33:40] ==> @NotNull public open fun from(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'child' @ [33:45] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'startOffsetInParent' @ [33:51] ==> public final val KtStringTemplateEntry.startOffsetInParent: Int[MyPropertyDescriptor]

'child' @ [33:72] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'textLength' @ [33:78] ==> public final val KtStringTemplateEntry.textLength: Int[MyPropertyDescriptor]

'rangeInsideHost' @ [34:17] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'endOffset' @ [34:33] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'childRange' @ [34:46] ==> val childRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'startOffset' @ [34:57] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'childRange' @ [37:17] ==> val childRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'endOffset' @ [37:28] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'rangeInsideHost' @ [37:41] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'startOffset' @ [37:57] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'when (child) {
                is KtEscapeStringTemplateEntry -> {
                    if (!rangeInsideHost.contains(childRange)) {
                        //don't allow injection if its range starts or ends inside escaped sequence
                        return false
                    }
                    val unescaped = child.unescapedValue
                    outChars.append(unescaped)
                    repeat(unescaped.length) {
                        sourceOffsetsList.add(sourceOffset)
                    }
                    sourceOffset += child.getTextLength()
                }
                else -> {
                    val textRange = rangeInsideHost.intersection(childRange)!!.shiftRight(-childRange.startOffset)
                    outChars.append(child.text, textRange.startOffset, textRange.endOffset)
                    repeat(textRange.length) {
                        sourceOffsetsList.add(sourceOffset++)
                    }
                }
            }' @ [40:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'child' @ [40:19] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'!' @ [42:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rangeInsideHost' @ [42:26] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'contains' @ [42:42] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'childRange' @ [42:51] ==> val childRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'child' @ [46:37] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'unescapedValue' @ [46:43] ==> public final val KtEscapeStringTemplateEntry.unescapedValue: (String..String?)[MyPropertyDescriptor]

'outChars' @ [47:21] ==> value-parameter outChars: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'append' @ [47:30] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'unescaped' @ [47:37] ==> val unescaped: (String..String?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'repeat' @ [48:21] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'unescaped' @ [48:28] ==> val unescaped: (String..String?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'length' @ [48:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'sourceOffsetsList' @ [49:25] ==> val sourceOffsetsList: TIntArrayList defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'add' @ [49:43] ==> public open fun add(p0: Int): Unit defined in gnu.trove.TIntArrayList[JavaMethodDescriptor]

'sourceOffset' @ [49:47] ==> var sourceOffset: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'sourceOffset' @ [51:21] ==> var sourceOffset: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'child' @ [51:37] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'getTextLength' @ [51:43] ==> public open fun getTextLength(): Int defined in org.jetbrains.kotlin.psi.KtStringTemplateEntry[JavaMethodDescriptor]

'rangeInsideHost' @ [54:37] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'intersection' @ [54:53] ==> @Nullable public open fun intersection(@NotNull p0: TextRange): TextRange? defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'childRange' @ [54:66] ==> val childRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'shiftRight' @ [54:80] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [54:91] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'childRange' @ [54:92] ==> val childRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'startOffset' @ [54:103] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'outChars' @ [55:21] ==> value-parameter outChars: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[ValueParameterDescriptorImpl]

'append' @ [55:30] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'child' @ [55:37] ==> val child: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'text' @ [55:43] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'textRange' @ [55:49] ==> val textRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'startOffset' @ [55:59] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'textRange' @ [55:72] ==> val textRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'endOffset' @ [55:82] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'repeat' @ [56:21] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'textRange' @ [56:28] ==> val textRange: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'length' @ [56:38] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'sourceOffsetsList' @ [57:25] ==> val sourceOffsetsList: TIntArrayList defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'add' @ [57:43] ==> public open fun add(p0: Int): Unit defined in gnu.trove.TIntArrayList[JavaMethodDescriptor]

'sourceOffset' @ [57:47] ==> var sourceOffset: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'sourceOffsetsList' @ [62:9] ==> val sourceOffsetsList: TIntArrayList defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'add' @ [62:27] ==> public open fun add(p0: Int): Unit defined in gnu.trove.TIntArrayList[JavaMethodDescriptor]

'sourceOffset' @ [62:31] ==> var sourceOffset: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'sourceOffsets' @ [63:9] ==> private final var sourceOffsets: IntArray? defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper[PropertyDescriptorImpl]

'sourceOffsetsList' @ [63:25] ==> val sourceOffsetsList: TIntArrayList defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.decode[LocalVariableDescriptor]

'toNativeArray' @ [63:43] ==> public open fun toNativeArray(): (IntArray..IntArray?) defined in gnu.trove.TIntArrayList[JavaMethodDescriptor]

'sourceOffsets' @ [68:23] ==> private final var sourceOffsets: IntArray? defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper[PropertyDescriptorImpl]

'offsets' @ [69:13] ==> val offsets: IntArray? defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[LocalVariableDescriptor]

'offsetInDecoded' @ [69:32] ==> value-parameter offsetInDecoded: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[ValueParameterDescriptorImpl]

'offsets' @ [69:51] ==> val offsets: IntArray? defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[LocalVariableDescriptor]

'size' @ [69:59] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'-' @ [69:72] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'+' @ [70:16] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'min' @ [70:21] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'offsets' @ [70:25] ==> val offsets: IntArray? defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[LocalVariableDescriptor]

'offsetInDecoded' @ [70:33] ==> value-parameter offsetInDecoded: Int defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[ValueParameterDescriptorImpl]

'rangeInsideHost' @ [70:51] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[ValueParameterDescriptorImpl]

'length' @ [70:67] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'rangeInsideHost' @ [70:77] ==> value-parameter rangeInsideHost: TextRange defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper.getOffsetInHost[ValueParameterDescriptorImpl]

'startOffset' @ [70:93] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'myHost' @ [74:16] ==> protected/*protected and package*/ final val myHost: (KtStringTemplateExpression..KtStringTemplateExpression?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper[JavaPropertyDescriptor]

'getContentRange' @ [74:23] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'myHost' @ [78:16] ==> protected/*protected and package*/ final val myHost: (KtStringTemplateExpression..KtStringTemplateExpression?) defined in org.jetbrains.kotlin.psi.KotlinStringLiteralTextEscaper[JavaPropertyDescriptor]

'isSingleQuoted' @ [78:23] ==> public fun KtStringTemplateExpression.isSingleQuoted(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

