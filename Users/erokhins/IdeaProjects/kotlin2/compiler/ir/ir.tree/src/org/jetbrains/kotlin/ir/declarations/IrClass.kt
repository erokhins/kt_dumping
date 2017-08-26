'CLASS' @ [26:35] ==> enum entry CLASS defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationKind[FakeCallableDescriptorForObject]

'declarations' @ [34:5] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'add' @ [34:18] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'member' @ [34:22] ==> value-parameter member: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.addMember[ValueParameterDescriptorImpl]

'declarations' @ [38:5] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'addAll' @ [38:18] ==> public abstract fun addAll(elements: Collection<IrDeclaration>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'members' @ [38:25] ==> value-parameter members: List<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.addAll[ValueParameterDescriptorImpl]

'declarations' @ [42:9] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[PropertyDescriptorImpl]

'filter' @ [42:22] ==> public inline fun <T> Iterable<IrDeclaration>.filter(predicate: (IrDeclaration) -> Boolean): List<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'when (it) {
                is IrAnonymousInitializer ->
                    true
                is IrProperty ->
                    it.backingField?.initializer != null
                is IrField ->
                    it.initializer != null
                else -> false
            }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [43:19] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.getInstanceInitializerMembers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [47:21] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.getInstanceInitializerMembers.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [47:24] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[PropertyDescriptorImpl]

'initializer' @ [47:38] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

'it' @ [49:21] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.ir.declarations.getInstanceInitializerMembers.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [49:24] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[PropertyDescriptorImpl]

