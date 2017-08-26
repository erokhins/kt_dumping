'FlagsToModifiers' @ [28:43] ==> public constructor FlagsToModifiers() defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.FlagsToModifiers[ClassConstructorDescriptorImpl]

'MODALITY' @ [30:30] ==> public final val MODALITY: (Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>..Flags.FlagField<(ProtoBuf.Modality..ProtoBuf.Modality?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [30:39] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [30:43] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.MODALITY.<no name provided>.getModifiers[ValueParameterDescriptorImpl]

'when (modality) {
            ProtoBuf.Modality.ABSTRACT -> KtTokens.ABSTRACT_KEYWORD
            ProtoBuf.Modality.FINAL -> KtTokens.FINAL_KEYWORD
            ProtoBuf.Modality.OPEN -> KtTokens.OPEN_KEYWORD
            ProtoBuf.Modality.SEALED -> KtTokens.SEALED_KEYWORD
            null -> throw IllegalStateException("Unexpected modality: null")
        }' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtModifierKeywordToken, entry1: KtModifierKeywordToken, entry2: KtModifierKeywordToken, entry3: KtModifierKeywordToken, entry4: KtModifierKeywordToken): KtModifierKeywordToken[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtModifierKeywordToken

'modality' @ [31:22] ==> val modality: (ProtoBuf.Modality..ProtoBuf.Modality?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.MODALITY.<no name provided>.getModifiers[LocalVariableDescriptor]

'ABSTRACT' @ [32:31] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'ABSTRACT_KEYWORD' @ [32:52] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL' @ [33:31] ==> enum entry FINAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'FINAL_KEYWORD' @ [33:49] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN' @ [34:31] ==> enum entry OPEN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'OPEN_KEYWORD' @ [34:48] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SEALED' @ [35:31] ==> enum entry SEALED defined in org.jetbrains.kotlin.serialization.ProtoBuf.Modality[FakeCallableDescriptorForObject]

'SEALED_KEYWORD' @ [35:50] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IllegalStateException' @ [36:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'FlagsToModifiers' @ [41:45] ==> public constructor FlagsToModifiers() defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.FlagsToModifiers[ClassConstructorDescriptorImpl]

'VISIBILITY' @ [43:32] ==> public final val VISIBILITY: (Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>..Flags.FlagField<(ProtoBuf.Visibility..ProtoBuf.Visibility?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [43:43] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'flags' @ [43:47] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.VISIBILITY.<no name provided>.getModifiers[ValueParameterDescriptorImpl]

'when (visibility) {
            ProtoBuf.Visibility.PRIVATE, ProtoBuf.Visibility.PRIVATE_TO_THIS -> KtTokens.PRIVATE_KEYWORD
            ProtoBuf.Visibility.INTERNAL -> KtTokens.INTERNAL_KEYWORD
            ProtoBuf.Visibility.PROTECTED -> KtTokens.PROTECTED_KEYWORD
            ProtoBuf.Visibility.PUBLIC -> KtTokens.PUBLIC_KEYWORD
            else -> throw IllegalStateException("Unexpected visibility: $visibility")
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtModifierKeywordToken?, entry1: KtModifierKeywordToken?, entry2: KtModifierKeywordToken?, entry3: KtModifierKeywordToken?, entry4: KtModifierKeywordToken?): KtModifierKeywordToken?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtModifierKeywordToken?

'visibility' @ [44:22] ==> val visibility: (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.VISIBILITY.<no name provided>.getModifiers[LocalVariableDescriptor]

'PRIVATE' @ [45:33] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PRIVATE_TO_THIS' @ [45:62] ==> enum entry PRIVATE_TO_THIS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PRIVATE_KEYWORD' @ [45:90] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL' @ [46:33] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'INTERNAL_KEYWORD' @ [46:54] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED' @ [47:33] ==> enum entry PROTECTED defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PROTECTED_KEYWORD' @ [47:55] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PUBLIC' @ [48:33] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.serialization.ProtoBuf.Visibility[FakeCallableDescriptorForObject]

'PUBLIC_KEYWORD' @ [48:52] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IllegalStateException' @ [49:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'visibility' @ [49:74] ==> val visibility: (ProtoBuf.Visibility..ProtoBuf.Visibility?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.VISIBILITY.<no name provided>.getModifiers[LocalVariableDescriptor]

'createBooleanFlagToModifier' @ [54:13] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_INNER' @ [54:47] ==> public final val IS_INNER: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'INNER_KEYWORD' @ [54:66] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [55:13] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_CONST' @ [55:47] ==> public final val IS_CONST: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'CONST_KEYWORD' @ [55:66] ==> public final val CONST_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [56:16] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_LATEINIT' @ [56:50] ==> public final val IS_LATEINIT: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'LATEINIT_KEYWORD' @ [56:72] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [57:16] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_OPERATOR' @ [57:50] ==> public final val IS_OPERATOR: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'OPERATOR_KEYWORD' @ [57:72] ==> public final val OPERATOR_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [58:13] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_INFIX' @ [58:47] ==> public final val IS_INFIX: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'INFIX_KEYWORD' @ [58:66] ==> public final val INFIX_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [59:12] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_DATA' @ [59:46] ==> public final val IS_DATA: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'DATA_KEYWORD' @ [59:64] ==> public final val DATA_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [60:20] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_EXTERNAL_FUNCTION' @ [60:54] ==> public final val IS_EXTERNAL_FUNCTION: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'EXTERNAL_KEYWORD' @ [60:85] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [61:25] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_EXTERNAL_PROPERTY' @ [61:59] ==> public final val IS_EXTERNAL_PROPERTY: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'EXTERNAL_KEYWORD' @ [61:90] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [62:22] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_EXTERNAL_CLASS' @ [62:56] ==> public final val IS_EXTERNAL_CLASS: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'EXTERNAL_KEYWORD' @ [62:84] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [63:14] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_INLINE' @ [63:48] ==> public final val IS_INLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'INLINE_KEYWORD' @ [63:68] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [64:15] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_TAILREC' @ [64:49] ==> public final val IS_TAILREC: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'TAILREC_KEYWORD' @ [64:70] ==> public final val TAILREC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createBooleanFlagToModifier' @ [65:15] ==> private fun createBooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken): FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[SimpleFunctionDescriptorImpl]

'IS_SUSPEND' @ [65:49] ==> public final val IS_SUSPEND: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'SUSPEND_KEYWORD' @ [65:70] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'BooleanFlagToModifier' @ [69:23] ==> public constructor BooleanFlagToModifier(flagField: Flags.BooleanFlagField, ktModifierKeywordToken: KtModifierKeywordToken) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.BooleanFlagToModifier[ClassConstructorDescriptorImpl]

'flagField' @ [69:45] ==> value-parameter flagField: Flags.BooleanFlagField defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.createBooleanFlagToModifier[ValueParameterDescriptorImpl]

'ktModifierKeywordToken' @ [69:56] ==> value-parameter ktModifierKeywordToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.createBooleanFlagToModifier[ValueParameterDescriptorImpl]

'FlagsToModifiers' @ [74:5] ==> public constructor FlagsToModifiers() defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.FlagsToModifiers[ClassConstructorDescriptorImpl]

'if (flagField.get(flags)) ktModifierKeywordToken else null' @ [75:70] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtModifierKeywordToken?, elseBranch: KtModifierKeywordToken?): KtModifierKeywordToken?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtModifierKeywordToken?

'flagField' @ [75:74] ==> private final val flagField: Flags.BooleanFlagField defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.BooleanFlagToModifier[PropertyDescriptorImpl]

'get' @ [75:84] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'flags' @ [75:88] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.BooleanFlagToModifier.getModifiers[ValueParameterDescriptorImpl]

'ktModifierKeywordToken' @ [75:96] ==> private final val ktModifierKeywordToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags.BooleanFlagToModifier[PropertyDescriptorImpl]

