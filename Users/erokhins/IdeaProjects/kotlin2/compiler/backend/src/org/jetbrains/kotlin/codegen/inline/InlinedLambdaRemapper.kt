'FieldRemapper' @ [28:5] ==> public constructor FieldRemapper(originalLambdaInternalName: String?, parent: FieldRemapper?, parameters: Parameters) defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[ClassConstructorDescriptorImpl]

'originalLambdaInternalName' @ [28:19] ==> value-parameter originalLambdaInternalName: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.<init>[ValueParameterDescriptorImpl]

'parent' @ [28:47] ==> value-parameter parent: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.<init>[ValueParameterDescriptorImpl]

'methodParams' @ [28:55] ==> value-parameter methodParams: Parameters defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.<init>[ValueParameterDescriptorImpl]

'isFolding' @ [31:13] ==> value-parameter isFolding: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.canProcess[ValueParameterDescriptorImpl]

'isMyBoundReceiverForDefaultLambda' @ [31:27] ==> private final fun isMyBoundReceiverForDefaultLambda(fieldOwner: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[SimpleFunctionDescriptorImpl]

'fieldOwner' @ [31:61] ==> value-parameter fieldOwner: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.canProcess[ValueParameterDescriptorImpl]

'fieldName' @ [31:73] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.canProcess[ValueParameterDescriptorImpl]

'super' @ [31:87] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[LazyClassReceiverParameterDescriptor]

'canProcess' @ [31:93] ==> protected open fun canProcess(fieldOwner: String, fieldName: String, isFolding: Boolean): Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'fieldOwner' @ [31:104] ==> value-parameter fieldOwner: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.canProcess[ValueParameterDescriptorImpl]

'fieldName' @ [31:116] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.canProcess[ValueParameterDescriptorImpl]

'isDefaultBoundCallableReference' @ [34:13] ==> private final val isDefaultBoundCallableReference: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[PropertyDescriptorImpl]

'fieldName' @ [34:48] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.isMyBoundReceiverForDefaultLambda[ValueParameterDescriptorImpl]

'BOUND_REFERENCE_RECEIVER' @ [34:69] ==> public const final val BOUND_REFERENCE_RECEIVER: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'fieldOwner' @ [34:97] ==> value-parameter fieldOwner: String defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.isMyBoundReceiverForDefaultLambda[ValueParameterDescriptorImpl]

'originalLambdaInternalName' @ [34:111] ==> public final val originalLambdaInternalName: String? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[PropertyDescriptorImpl]

'if (isMyBoundReceiverForDefaultLambda(insnNode.owner, insnNode.name)) AsmUtil.RECEIVER_NAME else insnNode.name' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isMyBoundReceiverForDefaultLambda' @ [37:17] ==> private final fun isMyBoundReceiverForDefaultLambda(fieldOwner: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[SimpleFunctionDescriptorImpl]

'insnNode' @ [37:51] ==> value-parameter insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldNameForFolding[ValueParameterDescriptorImpl]

'owner' @ [37:60] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'insnNode' @ [37:67] ==> value-parameter insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldNameForFolding[ValueParameterDescriptorImpl]

'name' @ [37:76] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'RECEIVER_NAME' @ [37:91] ==> public const final val RECEIVER_NAME: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'insnNode' @ [37:110] ==> value-parameter insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldNameForFolding[ValueParameterDescriptorImpl]

'name' @ [37:119] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'parent' @ [40:13] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[PropertyDescriptorImpl]

'findField' @ [40:22] ==> @JvmOverloads public open fun findField(fieldInsnNode: FieldInsnNode, captured: Collection<CapturedParamInfo> = ...): CapturedParamInfo? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'fieldInsnNode' @ [40:32] ==> value-parameter fieldInsnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.findField[ValueParameterDescriptorImpl]

'captured' @ [40:47] ==> value-parameter captured: Collection<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.findField[ValueParameterDescriptorImpl]

'if (parent!!.isRoot)
                super.getFieldForInline(node, prefix)
            else
                parent.getFieldForInline(node, prefix)' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue?, elseBranch: StackValue?): StackValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue?

'parent' @ [45:17] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[PropertyDescriptorImpl]

'isRoot' @ [45:26] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'super' @ [46:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[LazyClassReceiverParameterDescriptor]

'getFieldForInline' @ [46:23] ==> public open fun getFieldForInline(node: FieldInsnNode, prefix: StackValue?): StackValue? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'node' @ [46:41] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldForInline[ValueParameterDescriptorImpl]

'prefix' @ [46:47] ==> value-parameter prefix: StackValue? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldForInline[ValueParameterDescriptorImpl]

'parent' @ [48:17] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[PropertyDescriptorImpl]

'getFieldForInline' @ [48:24] ==> public open fun getFieldForInline(node: FieldInsnNode, prefix: StackValue?): StackValue? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'node' @ [48:42] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldForInline[ValueParameterDescriptorImpl]

'prefix' @ [48:48] ==> value-parameter prefix: StackValue? defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper.getFieldForInline[ValueParameterDescriptorImpl]

