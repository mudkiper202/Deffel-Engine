package engineInput;

import org.lwjgl.input.Keyboard;

public enum Key {
	A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z,
	ENTER, ESC, SPACE, COLON, SEMI_COLON, GREATER_THAN, LESS_THAN, PERIOD, COMMA,
	NUM_1, NUM_2, NUM_3, NUM_4, NUM_5, NUM_6, NUM_7, NUM_8, NUM_9, NUM_0, FOWARD_SLASH,
	UP_ARROW, DOWN_ARROW, RIGHT_ARROW, LEFT_ARROW;
	
	public static boolean isDown(Key key) {
		switch(key) {
		case A:
			if(Keyboard.isKeyDown(Keyboard.KEY_A)) return true;
			break;
		case B:
			if(Keyboard.isKeyDown(Keyboard.KEY_B)) return true;
			break;
		case C:
			if(Keyboard.isKeyDown(Keyboard.KEY_C)) return true;
			break;
		case D:
			if(Keyboard.isKeyDown(Keyboard.KEY_D)) return true;
			break;
		case E:
			if(Keyboard.isKeyDown(Keyboard.KEY_E)) return true;
			break;
		case F:
			if(Keyboard.isKeyDown(Keyboard.KEY_F)) return true;
			break;
		case G:
			if(Keyboard.isKeyDown(Keyboard.KEY_G)) return true;
			break;
		case H:
			if(Keyboard.isKeyDown(Keyboard.KEY_H)) return true;
			break;
		case I:
			if(Keyboard.isKeyDown(Keyboard.KEY_I)) return true;
			break;
		case J:
			if(Keyboard.isKeyDown(Keyboard.KEY_J)) return true;
			break;
		case K:
			if(Keyboard.isKeyDown(Keyboard.KEY_K)) return true;
			break;
		case L:
			if(Keyboard.isKeyDown(Keyboard.KEY_L)) return true;
			break;
		case M:
			if(Keyboard.isKeyDown(Keyboard.KEY_M)) return true;
			break;
		case N:
			if(Keyboard.isKeyDown(Keyboard.KEY_N)) return true;
			break;
		case O:
			if(Keyboard.isKeyDown(Keyboard.KEY_O)) return true;
			break;
		case P:
			if(Keyboard.isKeyDown(Keyboard.KEY_P)) return true;
			break;
		case Q:
			if(Keyboard.isKeyDown(Keyboard.KEY_Q)) return true;
			break;
		case R:
			if(Keyboard.isKeyDown(Keyboard.KEY_R)) return true;
			break;
		case S:
			if(Keyboard.isKeyDown(Keyboard.KEY_S)) return true;
			break;
		case T:
			if(Keyboard.isKeyDown(Keyboard.KEY_T)) return true;
			break;
		case U:
			if(Keyboard.isKeyDown(Keyboard.KEY_U)) return true;
			break;
		case V:
			if(Keyboard.isKeyDown(Keyboard.KEY_V)) return true;
			break;
		case W:
			if(Keyboard.isKeyDown(Keyboard.KEY_W)) return true;
			break;
		case X:
			if(Keyboard.isKeyDown(Keyboard.KEY_X)) return true;
			break;
		case Y:
			if(Keyboard.isKeyDown(Keyboard.KEY_Y)) return true;
			break;
		case Z:
			if(Keyboard.isKeyDown(Keyboard.KEY_Z)) return true;
			break;
		case COLON:
			if(Keyboard.isKeyDown(Keyboard.KEY_COLON)) return true;
			break;
		case COMMA:
			if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) return true;
			break;
		case DOWN_ARROW:
			if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) return true;
			break;
		case ENTER:
			if(Keyboard.isKeyDown(Keyboard.KEY_RETURN)) return true;
			break;
		case ESC:
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) return true;
			break;
		case FOWARD_SLASH:
			if(Keyboard.isKeyDown(Keyboard.KEY_SLASH)) return true;
			break;
		case GREATER_THAN:
			if(Keyboard.isKeyDown(Keyboard.KEY_LBRACKET)) return true;
			break;
		case LEFT_ARROW:
			if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) return true;
			break;
		case LESS_THAN:
			if(Keyboard.isKeyDown(Keyboard.KEY_RBRACKET)) return true;
			break;
		case NUM_0:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD0)) return true;
			break;
		case NUM_1:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD1)) return true;
			break;
		case NUM_2:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD2)) return true;
			break;
		case NUM_3:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD3)) return true;
			break;
		case NUM_4:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD4)) return true;
			break;
		case NUM_5:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD5)) return true;
			break;
		case NUM_6:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD6)) return true;
			break;
		case NUM_7:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD7)) return true;
			break;
		case NUM_8:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD8)) return true;
			break;
		case NUM_9:
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD9)) return true;
			break;
		case PERIOD:
			if(Keyboard.isKeyDown(Keyboard.KEY_PERIOD)) return true;
			break;
		case RIGHT_ARROW:
			if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) return true;
			break;
		case SEMI_COLON:
			if(Keyboard.isKeyDown(Keyboard.KEY_SEMICOLON)) return true;
			break;
		case SPACE:
			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)) return true;
			break;
		case UP_ARROW:
			if(Keyboard.isKeyDown(Keyboard.KEY_UP)) return true;
			break;
		}
		return false;
	}
	
}
