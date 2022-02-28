function Reducer(state, action) {
	switch (action.type) {
		case 'update-tasklist':
			const taskUpdateList = state.task;
			taskUpdateList.taskList = action.taskList;
			return { ...state, task: taskUpdateList }
		case 'add-task':
			const newTaskList = state.task.taskList;
			newTaskList.push(action.item);
			return { ...state, task: { taskList: newTaskList, item: {} } }

		case 'delete-task':
			const taskDeleteItem = state.task;
			const taskListUpdate = taskDeleteItem.taskList.filter((item) => {
				return item.id !== action.id;
			});
			taskDeleteItem.taskList = taskListUpdate;
			return { ...state, task: taskDeleteItem }
		
		
		
		
		
			case 'update-item':
			const todoUpdateItem = state.todo;
			const listUpdateEdit = todoUpdateItem.todoList.map((item) => {
				return item.id === action.item.id ? action.item : item; 
			});
			todoUpdateItem.todoList = listUpdateEdit;
			todoUpdateItem.item = {};
			return { ...state, todo: todoUpdateItem };
		case 'delete-item':
			const todoDeleteItem = state.todo;
			const listUpdate = todoDeleteItem.todoList.filter((item) => {
				return item.id !== action.id;
			});
			todoDeleteItem.todoList = listUpdate;
			return { ...state, todo: todoDeleteItem }
		case 'update-list':
			const todoUpdateList = state.todo;
			todoUpdateList.todoList = action.todoList;
			return { ...state, todo: todoUpdateList }
		case 'edit-item':
			const todoEditItem = state.todo;
			todoEditItem.item = action.item;
			return { ...state, todo: todoEditItem }
		case 'add-item':
			const newList = state.todo.todoList;
			newList.push(action.item);
			return { ...state, todo: { todoList: newList, item: {} } }
		default:
			return state;
	}
}

export default Reducer;