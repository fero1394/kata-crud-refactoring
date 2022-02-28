import React, { Fragment } from 'react';
import {StoreProvider} from "../Store";
import List from "./List";
import Form from "./Form";

const TodoComponent = () => {
	return (
		<Fragment>
			<div>
				<StoreProvider>
					<Form />
					<List />
				</StoreProvider>
			</div>
		</Fragment>
	);
}
 
export default TodoComponent;