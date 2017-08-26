'pseudocode' @ [27:60] ==> public open val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'mutableInstructionList' @ [27:71] ==> internal final val mutableInstructionList: ArrayList<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[PropertyDescriptorImpl]

'pseudocode' @ [29:57] ==> public open val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'correspondingElement' @ [29:68] ==> public open val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[PropertyDescriptorImpl]

'-' @ [31:43] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (comment == null) name else "$name [$comment]"' @ [33:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'comment' @ [33:43] ==> private final val comment: String? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'name' @ [33:60] ==> public open val name: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'name' @ [33:72] ==> public open val name: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'comment' @ [33:79] ==> private final val comment: String? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'targetInstructionIndex' @ [36:21] ==> public open var targetInstructionIndex: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'when {
            index < 0 ->
                error("resolveToInstruction: unbound label $name " +
                      "in subroutine ${correspondingElement.text} with instructions $instructionList")
            index >= instructionList.size ->
                error("resolveToInstruction: incorrect index $index for label $name " +
                      "in subroutine ${correspondingElement.text} with instructions $instructionList")
            else ->
                return instructionList[index]
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'index' @ [38:13] ==> val index: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.resolveToInstruction[LocalVariableDescriptor]

'error' @ [39:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [39:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [39:61] ==> public open val name: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'correspondingElement' @ [40:40] ==> private final val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'text' @ [40:61] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'instructionList' @ [40:86] ==> private final val instructionList: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'index' @ [41:13] ==> val index: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.resolveToInstruction[LocalVariableDescriptor]

'instructionList' @ [41:22] ==> private final val instructionList: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'size' @ [41:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [42:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [42:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'index' @ [42:63] ==> val index: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.resolveToInstruction[LocalVariableDescriptor]

'name' @ [42:80] ==> public open val name: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'correspondingElement' @ [43:40] ==> private final val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'text' @ [43:61] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'instructionList' @ [43:86] ==> private final val instructionList: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'instructionList' @ [45:24] ==> private final val instructionList: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'index' @ [45:40] ==> val index: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.resolveToInstruction[LocalVariableDescriptor]

'PseudocodeLabel' @ [50:13] ==> internal constructor PseudocodeLabel(pseudocode: PseudocodeImpl, name: String, comment: String?) defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[ClassConstructorDescriptorImpl]

'newPseudocode' @ [50:29] ==> value-parameter newPseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.copy[ValueParameterDescriptorImpl]

'+' @ [50:44] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newLabelIndex' @ [50:50] ==> value-parameter newLabelIndex: Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel.copy[ValueParameterDescriptorImpl]

'name' @ [50:75] ==> public open val name: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

'comment' @ [50:82] ==> private final val comment: String? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeLabel[PropertyDescriptorImpl]

